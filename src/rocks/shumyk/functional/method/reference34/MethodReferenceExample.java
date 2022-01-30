package rocks.shumyk.functional.method.reference34;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Predicate<Instructor> predicate = Instructor::isOnlineCourses;

		Function<Integer, Double> sqrt = Math::sqrt;

		Function<String, String> lowercaseFunc = String::toLowerCase;

		Predicate<Instructor> years = MethodReferenceExample::greaterThanTenYearsExperience;

		Instructors.getAll().stream()
			.filter(years)
			.forEach(System.out::println);
	}

	public static boolean greaterThanTenYearsExperience(Instructor instructor) {
		 return instructor.getYearsOfExperience() > 10;
	}
}
