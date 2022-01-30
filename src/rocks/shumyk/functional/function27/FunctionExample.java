package rocks.shumyk.functional.function27;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		final Function<Integer, Double> sqrt = Math::sqrt;
		System.out.println("square root of 64: " + sqrt.apply(64));
		System.out.println("square root of 81: " + sqrt.apply(81));

		Function<String, String> lowercaseFunction = String::toLowerCase;
		System.out.println(lowercaseFunction.apply("UPPERCASE"));

		Function<String, String> concatFunction = s -> s.concat(" in Java");
		System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
		System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMMING"));
	}
}
