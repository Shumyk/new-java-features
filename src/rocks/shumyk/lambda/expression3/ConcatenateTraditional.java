package rocks.shumyk.lambda.expression3;

public class ConcatenateTraditional implements ConcatenateInterface {
	@Override
	public String sconcat(String a, String b) {
		return String.format("%s %s", a, b);
	}

	public static void main(String[] args) {
		final ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
		final String result = concatenateTraditional.sconcat("Hello", "World");
		System.out.println(result);
	}
}
