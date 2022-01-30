package rocks.shumyk.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
	public static void main(String[] args) {
		final ArrayList<String> names = new ArrayList<>();
		names.add("Mike");
		names.add("Vova");
		names.add("Hanna");
		System.out.println(names);
		System.out.println();

		names.remove("Vova");
		System.out.println(names);
		System.out.println();

		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
	}
}
