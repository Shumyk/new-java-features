package rocks.shumyk.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerators56 {
	public static void main(String[] args) {
		// of
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
		stream.forEach(System.out::println);
		System.out.println();

		// iterate generate a stream of 10 even numbers
		final Stream<Integer> iterateStream = Stream.iterate(0, i -> i + 2).limit(10);
		iterateStream.forEach(System.out::println);
		System.out.println();

		// generate 10 random numbers
		final Stream<Integer> generateStream = Stream.generate(new Random()::nextInt).limit(10);
		 generateStream.forEach(System.out::println);
	}
}
