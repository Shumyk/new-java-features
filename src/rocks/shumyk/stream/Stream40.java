package rocks.shumyk.stream;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream40 {
	public static void main(String[] args) {
		// create a map of names and courses of instructors who teaches online and more than 10 years experience
		Predicate<Instructor> online = Instructor::isOnlineCourses;
		Predicate<Instructor> experience = i -> i.getYearsOfExperience() > 10;

		List<Instructor> list = Instructors.getAll();

		final Map<String, List<String>> nameToCourses = list.stream()
			.filter(online)
			.filter(experience)
			.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(nameToCourses);
	}
}
