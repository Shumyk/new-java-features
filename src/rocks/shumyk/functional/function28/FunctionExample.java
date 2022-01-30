package rocks.shumyk.functional.function28;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionExample {
	public static void main(String[] args) {
		// map of instructors with name and years of experience
		// fucntion which will List<Instructors> and return a Map<String, Integer>
		// predicate will return true if instructor has online courses
		Predicate<Instructor> onlineCourses = Instructor::isOnlineCourses;
		Function<List<Instructor>, Map<String, Integer>> mapFunction = i -> i.stream()
			.filter(onlineCourses)
			.collect(Collectors.toMap(Instructor::getName, Instructor::getYearsOfExperience));

		System.out.println(mapFunction.apply(Instructors.getAll()));
	}
}
