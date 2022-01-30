package rocks.shumyk.stream;

import java.util.Arrays;
import java.util.Optional;

public class StreamReduceExample49 {
	public static void main(String[] args) {
		final Integer result = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
			.stream()
			.reduce(0, (a, b) -> a + b);
		System.out.println(result);

		final Optional<Integer> resultOptional = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
			.stream()
			.reduce((a, b) -> a + b);
		if (resultOptional.isPresent()) {
			System.out.println(resultOptional);
		}
	}
}
