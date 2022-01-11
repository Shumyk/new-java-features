package rocks.shumyk.lambda.expression2;

public class IncrementByFiveTraditional implements IncrementByFiveInterface{
	@Override
	public int incrementByFive(int a) {
		return a + 5;
	}

	public static void main(String[] args) {
		final IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
		System.out.println(incrementByFiveTraditional.incrementByFive(5)); // should be 10
	}
}
