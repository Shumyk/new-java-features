package rocks.shumyk.functional.predicate23;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.awt.*;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		// all instructors who teach online
		final Predicate<Instructor> online = Instructor::isOnlineCourses;
		// instructors experience is > 10 years
		final Predicate<Instructor> experienceMore10 = instructor -> instructor.getYearsOfExperience() > 10;

		// who teaches online
		final List<Instructor> instructors = Instructors.getAll();
		instructors.stream()
			.filter(online)
			.forEach(System.out::println);
		System.out.println();

		//  both
		instructors.stream()
			.filter(online)
			.filter(experienceMore10)
			.forEach(System.out::println);
	}
}
