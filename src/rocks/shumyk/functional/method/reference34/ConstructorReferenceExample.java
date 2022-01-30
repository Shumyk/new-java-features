package rocks.shumyk.functional.method.reference34;

import rocks.shumyk.functional.mocked.db.Instructor;
import rocks.shumyk.functional.mocked.db.InstructorFactory;

import java.util.Arrays;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		InstructorFactory factory = Instructor::new;
		final Instructor instructor = factory.getInstructor("Joe", 10, "Developer", "M", true, Arrays.asList("Java", "C++", "Python"));
		System.out.println(instructor);
	}
}
