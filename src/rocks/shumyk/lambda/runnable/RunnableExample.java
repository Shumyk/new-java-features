package rocks.shumyk.lambda.runnable;

import java.util.stream.IntStream;

public class RunnableExample {
	public static void main(String[] args) {
		// runnable traditional way example
		final Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += i;
				}
				System.out.println("Traditional: " + sum);
			}
		};
		new Thread(runnable).start();

		// implement using lambda
		final Runnable runnableLambda = () -> {
			int sum = IntStream.range(0, 10).sum();
			System.out.println("Runnable Lambda: " + sum);
		};
		new Thread(runnableLambda).start();

		// even cooler: implement using Thread with Lambda
		new Thread(() -> System.out.println("Thread with Lambda: " + IntStream.range(0, 10).sum()))
			.start();
	}
}
