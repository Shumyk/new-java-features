package rocks.shumyk.functional.unary30;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryExample {
	public static void main(String[] args) {
		UnaryOperator<Integer> unary = i -> i * 10;
		System.out.println(unary.apply(100));

		Function<Integer, Integer> function = i -> i * 10;
		System.out.println(function.apply(100));

		IntUnaryOperator intUnaryOperator = i -> i * 10;
		System.out.println(intUnaryOperator.applyAsInt(100));

		DoubleUnaryOperator doubleUnaryOperator = d -> d * 10.0;
		System.out.println(doubleUnaryOperator.applyAsDouble(100));
	}
}
