package rocks.shumyk.functional.method.reference34;

import rocks.shumyk.functional.mocked.db.Instructor;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Predicate<Instructor> predicate = Instructor::isOnlineCourses;

		Function<Integer, Double> sqrt = Math::sqrt;

		Function<String, String> lowercaseFunc = String::toLowerCase;
	}
}
