package rocks.shumyk.functional.mocked.db;

import java.util.List;

import static java.util.Arrays.asList;

public class Instructors {
	public static List<Instructor> getAll() {
		final Instructor instructor1 = new Instructor("Mike", 10, "Software developer", "M", true, asList("Java Programming", "C++ programming"));
		final Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", "F", false, asList("Multi-Threaded Programming", "CI/CD", "Unit Testing"));
		final Instructor instructor3 = new Instructor("Gene", 6, "Manager", "M", false, asList("C Programming", "C++ Programming", "React Native"));
		final Instructor instructor4 = new Instructor("Anthony", 15, "Senior Developer", "M", true, asList("Java Programming", "Angular Programming", "React Native"));
		final Instructor instructor5 = new Instructor("Syed", 15, "Principal Engineer", "M", true, asList("Java Programming", "Java Multi-Threaded Programming", "React Native"));

		return asList(instructor1, instructor2, instructor3, instructor4, instructor5);
	}
}
