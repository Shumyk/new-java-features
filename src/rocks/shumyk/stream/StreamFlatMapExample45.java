package rocks.shumyk.stream;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFlatMapExample45 {
	public static void main(String[] args) {
		// get a list of all courses which available
		Set<String> instructorsCourses = Instructors.getAll().stream()
			.map(Instructor::getCourses)
			.flatMap(List::stream)
			.collect(Collectors.toSet());
		System.out.println(instructorsCourses);
	}
}
