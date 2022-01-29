package rocks.shumyk.functional.number.consumer19;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		IntConsumer intConsumer = i -> System.out.println(i * 10);
		intConsumer.accept(10);

		LongConsumer longConsumer = l -> System.out.println(l * 10L);
		longConsumer.accept(10L);

		DoubleConsumer doubleConsumer = d -> System.out.println(d * 10);
		doubleConsumer.accept(10.5);
	}
}
