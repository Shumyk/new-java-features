package rocks.shumyk.lambda.expression3;

public class ConcatenateLambda {
	public static void main(String[] args) {
		final ConcatenateInterface concatenate = (a, b) -> String.format("%s %s", a, b);

		System.out.println(concatenate.sconcat("hello", "kitty")); // output should be 'hello kitty'f
	}
}
