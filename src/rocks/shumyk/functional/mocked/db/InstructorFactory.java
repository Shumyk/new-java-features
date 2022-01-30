package rocks.shumyk.functional.mocked.db;

import java.util.List;

public interface InstructorFactory {
	Instructor getInstructor(String name, int experience, String title, String gender, boolean onlineCourses, List<String> courses);
}
