package rocks.shumyk.functional.predicate.numbers24;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample {
	public static void main(String[] args) {
		IntPredicate moreThan100 = i -> i > 100;
		System.out.println(moreThan100.test(100));
		System.out.println(moreThan100.test(1000));
		System.out.println();

		LongPredicate longMoreThan100 = i -> i > 100L;
		System.out.println(longMoreThan100.test(1111111111L));
		System.out.println(longMoreThan100.test(3L));
		System.out.println();

		DoublePredicate doubleLessThan100p25 = i -> i < 100.25;
		DoublePredicate doubleMoreThan100p15 = i -> i > 100.10;
		System.out.println(doubleLessThan100p25.and(doubleMoreThan100p15).test(100.15));
	}
}
