package rocks.shumyk.functional.real.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.DoubleBinaryOperator;

public class BankAccount {
	private int id;
	private double balance;
	private String accountName;
	final Lock lock = new ReentrantLock();

	DoubleBinaryOperator subtractFunction = (a, b) -> a - b;
	DoubleBinaryOperator addFunction = Double::sum;

	public BankAccount(int id, double balance, String accountName) {
		this.id = id;
		this.balance = balance;
		this.accountName = accountName;
	}

	public boolean withdraw(double amount) throws InterruptedException {
		if (this.lock.tryLock()) {
			Thread.sleep(100);
			balance = subtractFunction.applyAsDouble(balance, amount);
			this.lock.unlock();
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) throws InterruptedException {
		if (this.lock.tryLock()) {
			TimeUnit.MILLISECONDS.sleep(100);
			balance = addFunction.applyAsDouble(balance, amount);
			this.lock.unlock();
			return true;
		}
		return false;
	}

	public boolean transfer(BankAccount to, double amount) throws InterruptedException {
		if (withdraw(amount)) {
			System.out.println("Withdraw amount: " + amount + " from " + getAccountName());

			if (to.deposit(amount)) {
				System.out.println("Deposit amount: " + amount + " to: " + to.getAccountName());
				return true;
			} else {
				System.out.println("Failed to acquire both locks: refunding " + amount + " to: " + getAccountName());
				while (!deposit(amount)) {
					continue;
				}
			}
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		return "BankAccount{" +
			"id=" + id +
			", balance=" + balance +
			", accountName='" + accountName + '\'' +
			'}';
	}
}
