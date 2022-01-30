package rocks.shumyk.functional.binary.operator31;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = Integer::sum;
		System.out.println(binaryOperator.apply(2, 5));

		Comparator<Integer> comparator = Integer::compareTo;
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println(maxBy.apply(7, 8));

		final BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println(minBy.apply(7, 8));

		IntBinaryOperator intBy = (a, b) -> a * b;
		System.out.println(intBy.applyAsInt(2, 8));

		LongBinaryOperator longBy = (a, b) -> a * b;
		System.out.println(longBy.applyAsLong(20L, 3L));

		DoubleBinaryOperator doubleBy = (a, b) -> a * b;
		System.out.println(doubleBy.applyAsDouble(22.22, 2.2));
	}
}
