package rocks.shumyk.functional.consumer1;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		final Consumer<String> c = x -> System.out.println(x.length() + " length, the value of x: " + x);
		c.accept("Up in the air");

		// consumer with block statement
		final Consumer<Integer> d = x -> {
			System.out.println("x * x = " + x * x);
			System.out.println("x / x = " + x / x);
		};
		d.accept(10);
	}
}
