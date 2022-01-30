package rocks.shumyk.functional.predicate.biconsumer25;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
	public static void main(String[] args) {
		final List<Instructor> instructors = Instructors.getAll();

		// all instructor who teaches online
		Predicate<Instructor> online = Instructor::isOnlineCourses;
		// instructors experience is > 10
		Predicate<Instructor> experienceMoreThan10 = i -> i.getYearsOfExperience() > 10;

		// bi consumer print name and courses
		BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is: " + name + ", courses: " + courses);

		instructors.stream()
			.filter(online.and(experienceMoreThan10))
			.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getCourses()));
	}
}
