package rocks.shumyk.lambda.expression2;

public class IncrementByFiveLambda {
	public static void main(String[] args) {
		final IncrementByFiveInterface incrementByFive = x -> x + 5;
		System.out.println(incrementByFive.incrementByFive(5)); // should be 10
	}
}
