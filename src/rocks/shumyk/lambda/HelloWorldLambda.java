package rocks.shumyk.lambda;

public class HelloWorldLambda {
	public static void main(String[] args) {
		// implementing sayHelloWorld using lambda
		final HelloWorldInterface helloWorldInterface = () -> "Hello World";
		System.out.println(helloWorldInterface.sayHelloWorld());
	}
}
