package com.orangeandbronze.adapter.yours;

import java.util.List;

import com.orangeandbronze.adapter.theirs.Student;

public class CsvOutputter {

	public void csvOut(List<Student> students) {
		for (Student student : students) {
			System.out.println(student.getId() + ", " + student.getLastName()
					+ ", " + student.getFirstName());
		}
	}

}
