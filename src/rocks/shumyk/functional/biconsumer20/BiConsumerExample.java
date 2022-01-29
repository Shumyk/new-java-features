package rocks.shumyk.functional.biconsumer20;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		// printing two numbers
		BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x: " + x + ", y: " + y);
		biConsumer.accept(2, 4);

		// calculating sum of two integers
		BiConsumer<Integer, Integer> biConsumerSum = (x, y) -> System.out.println("x + y = " + (x + y));
		biConsumerSum.accept(2, 4);

		// concatenate string
		BiConsumer<String, String> biConsumerConcatenate = (x, y) -> System.out.println(x + y);
		biConsumerConcatenate.accept("Fell on", " deaf ears");
	}
}
