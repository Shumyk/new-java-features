package rocks.shumyk.functional.biconsumer21;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();

		// print out name and gender of instructors
		BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("name is: " + name + ", gender is: " + gender);

		instructors.forEach(i -> biConsumer.accept(i.getName(), i.getGender()));
		System.out.println();

		// print out name and list of courses
		BiConsumer<String, List<String>> biConsumerNameCourses = (name, courses) -> System.out.println("name is: " + name + ", courses: " + courses);
		instructors.forEach(i -> biConsumerNameCourses.accept(i.getName(), i.getCourses()));
		System.out.println();

		// print out name and gender of all instructors who teaches online
		instructors.stream()
			.filter(Instructor::isOnlineCourses)
			.forEach(i -> biConsumer.accept(i.getName(), i.getGender()));
	}
}
