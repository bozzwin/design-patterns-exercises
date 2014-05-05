package com.orangeandbronze.adapter2.yours;

import java.util.List;

import com.orangeandbronze.adapter2.theirs.Student;

public class CsvOutputter {

	public void csvOut(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
