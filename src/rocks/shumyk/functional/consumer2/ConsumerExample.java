package rocks.shumyk.functional.consumer2;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.Instructors;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		final List<Instructor> instructors = Instructors.getAll();

		// looping through all the instructor and printing out the values of instructor
		final Consumer<Instructor> instructorConsumer = System.out::println;
		instructors.forEach(instructorConsumer);

		System.out.println("---------------------------");
		// loop through all the instructors and only print out their names
		final Consumer<Instructor> instructorNameConsumer = i -> System.out.println(i.getName());
		instructors.forEach(instructorNameConsumer);

		System.out.println("---------------------------");
		// loop through all the instructors and print out their names and their courses
		final Consumer<Instructor> instructorCoursesConsumer = i -> System.out.println(i.getCourses());
		instructors.forEach(instructorNameConsumer.andThen(instructorCoursesConsumer));

		System.out.println("---------------------------");
		// loop through all the instructors and print out their name if the years of experience is > 10
		instructors.stream()
			.filter(i -> i.getYearsOfExperience() > 10)
			.forEach(instructorConsumer);

		System.out.println("---------------------------");
		// loop through all the instructors and print out their name and years of experience if years of experience > 5 and teaches courses online
		instructors.stream()
			.filter(Instructor::isOnlineCourses)
			.filter(i -> i.getYearsOfExperience() > 5)
			.forEach(instructorConsumer);
	}
}
