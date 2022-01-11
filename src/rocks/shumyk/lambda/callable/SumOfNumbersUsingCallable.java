package rocks.shumyk.lambda.callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
	public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
	public static int total = IntStream.rangeClosed(0, 5000).sum();


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		final Callable<Integer> callable1 = () -> {
			int sum = 0;
			for (int i = 0; i < array.length / 2; i++) {
				sum += array[i];
			}
			return sum;
		};

		final Callable<Integer> callable2 = () -> {
			int sum = 0;
			for (int i = array.length / 2; i < array.length; i++) {
				sum += array[i];
			}
			return sum;
		};

		final ExecutorService executorService = Executors.newFixedThreadPool(2);
		final List<Future<Integer>> futures = executorService.invokeAll(Arrays.asList(callable1, callable2));

		int k = 0;
		int sum = 0;
		for (Future<Integer> result : futures) {
			System.out.println("Sum of " + ++k + " is: " + result.get());
			sum += result.get();
		}
		System.out.println("Sum of the callables: " + sum);
		System.out.println("Correct sum from IntStream is: " + total);

		executorService.shutdown();
	}
}
