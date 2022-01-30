package rocks.shumyk.functional.supplier32;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> new Random().nextInt();
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}
}
