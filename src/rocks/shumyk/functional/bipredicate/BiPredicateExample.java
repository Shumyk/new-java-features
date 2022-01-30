package rocks.shumyk.functional.bipredicate;

import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		// instructors who teach online and have experience more than 10 years
		BiPredicate<Boolean, Integer> onlineAndYearsExperienceMore10 = (online, years) -> online && years > 10;

		// bi consumer print name and courses
		BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is: " + name + ", courses: " + courses);

		Instructors.getAll().stream()
			.filter(i -> onlineAndYearsExperienceMore10.test(i.isOnlineCourses(), i.getYearsOfExperience()))
			.forEach(i -> biConsumer.accept(i.getName(), i.getCourses()));
	}
}
