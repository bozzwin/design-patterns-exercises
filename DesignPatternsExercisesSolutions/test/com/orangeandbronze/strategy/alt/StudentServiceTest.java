package com.orangeandbronze.strategy.alt;

import static org.junit.Assert.*;

import java.io.File;
import java.util.*;

import org.junit.Test;

public class StudentServiceTest {

	@Test
	public void xml() throws Exception {
		File file = new File("resources/students.xml");
		StudentService service = new StudentService();
		List<Student> expected = new ArrayList<Student>();
		expected.add(new Student(1010, "Arroyo", "Gloria"));
		expected.add(new Student(2013, "Ramos", "Fidel"));
		expected.add(new Student(3514, "Aquino", "Cory"));
		assertEquals(expected,
				service.getStudents(file, FileFormat.XML));
	}
	
	@Test
	public void csv() throws Exception {
		File file = new File("resources/students.csv");
		StudentService service = new StudentService();
		List<Student> expected = new ArrayList<Student>();
		expected.add(new Student(1010, "Arroyo", "Gloria"));
		expected.add(new Student(2013, "Ramos", "Fidel"));
		expected.add(new Student(3514, "Aquino", "Cory"));
		assertEquals(expected,
				service.getStudents(file, FileFormat.CSV));
	}

}
