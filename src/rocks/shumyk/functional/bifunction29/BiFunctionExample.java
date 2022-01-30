package rocks.shumyk.functional.bifunction29;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiFunctionExample {
	public static void main(String[] args) {
		// bi function 2 inputs List<Instructor> and second predicate with will filter if instructor has online courses
		// and return a map of <String, Integer> (name, experience)
		Predicate<Instructor> hasOnlineCourses = Instructor::isOnlineCourses;
		BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> toMap = (i, p) -> i.stream()
			.filter(p)
			.collect(Collectors.toMap(Instructor::getName, Instructor::getYearsOfExperience));

		System.out.println(toMap.apply(Instructors.getAll(), hasOnlineCourses));
	}
}
