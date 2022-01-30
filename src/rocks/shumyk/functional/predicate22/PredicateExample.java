package rocks.shumyk.functional.predicate22;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		// if number is > 10 return true other false
		Predicate<Integer> predicate10 = i -> i > 10;
		System.out.println(predicate10.test(100));

		// i > 10 &&number is even (i%2 == 0)
		Predicate<Integer> isEven = i -> i % 2 == 0;
		System.out.println(predicate10.and(isEven).test(20));

		// i > 10 || number is even number
		System.out.println(predicate10.or(isEven).test(4));

		// i > 0 && number is odd
		System.out.println(predicate10.and(isEven.negate()).test(33));
	}
}
