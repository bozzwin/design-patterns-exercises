package com.orangeandbronze.strategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileFormatCsv implements FileFormat {
	public List<Student> unmarshal(File file) throws Exception {
		List<Student> students = new ArrayList<Student>();
		try (BufferedReader buff = new BufferedReader(new FileReader(file))) {
			String line = buff.readLine();
			while (line != null) {
				String[] tokens = line.split(", ");
				students.add(new Student(Integer.parseInt(tokens[0]),
						tokens[1], tokens[2]));
				line = buff.readLine();
			}
		}
		return students;
	}
}
