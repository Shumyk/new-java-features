package rocks.shumyk.functional.real.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import static java.util.concurrent.TimeUnit.HOURS;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class BankTransfer {
	public static void main(String[] args) {
		AccountFactory factory = BankAccount::new;
		final BankAccount studentA = factory.getBankAccount(1, 5000, "StudentA");
		final BankAccount university = factory.getBankAccount(2, 10000, "University");

		BiPredicate<Double, Double> predicate = (balance, amount) -> balance > amount;
		BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + y);
		BiConsumer<BankAccount, BankAccount> printerBank = (a, b) -> System.out.println("Ending balance of student account: " + a.getBalance() + ", University account: " + b.getBalance());

		ExecutorService service = Executors.newFixedThreadPool(10);

		Thread thread1 = new Thread(() -> {
			try {
				System.out.println(Thread.currentThread().getName() + " says:: Executing Transfer");
				double amount = 1000;
				if (!predicate.test(studentA.getBalance(), amount)) {
					printer.accept(Thread.currentThread().getName() + " says :: balance insufficient, ", amount);
				}

				while (!studentA.transfer(university, amount)) {
					MILLISECONDS.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printer.accept(Thread.currentThread().getName() + " says transfer is successful: Balance in account ", university.getBalance());
		});

		for (int i = 0; i < 20; i++) {
			service.submit(thread1);
		}
		service.shutdown();

		try {
			while (!service.awaitTermination(24L, HOURS)) {
				System.out.println("Not yet. Still waiting for termination");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		printerBank.accept(studentA, university);
	}
}
