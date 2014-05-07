package com.orangeandbronze.adapter;

import java.util.ArrayList;
import java.util.List;

import com.orangeandbronze.adapter.theirs.Outputter;
import com.orangeandbronze.adapter.theirs.Student;
import com.orangeandbronze.adapter.theirs.StudentService;

public class Runner {

	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1010, "Arroyo", "Gloria"));
		students.add(new Student(2013, "Ramos", "Fidel"));
		students.add(new Student(3514, "Aquino", "Cory"));
		StudentService service = new StudentService();
		service.setOutputter(new OutputterAdapter());
		service.dump(students);

	}

}
