package com.orangeandbronze.strategy;

import java.io.*;
import java.util.*;
import javax.xml.bind.*;
import javax.xml.transform.stream.StreamSource;

/** 
 * Use the Strategy pattern by adding a setter
 * that passes in the proper strategy for parsing
 * the file format 
 */
public class StudentService {
	List<Student> getStudents(File file, FileFormat format) throws Exception {
		if (format == FileFormat.XML) {
			JAXBContext jc = JAXBContext.newInstance(Wrapper.class, Student.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			StreamSource xml = new StreamSource(file);
			Wrapper<Student> wrapper = (Wrapper<Student>) unmarshaller.unmarshal(xml,
			        Wrapper.class).getValue();
	        return wrapper.getItems();
		} else if (format == FileFormat.CSV) {
			List<Student> students = new ArrayList<Student>();
			try(BufferedReader buff = new BufferedReader(new FileReader(file))) {
				String line = buff.readLine();
				while (line != null) {
					String[] tokens = line.split(", ");
					students.add(new Student(Integer.parseInt(tokens[0]), tokens[1], tokens[2]));
					line = buff.readLine();
				}
			}
			return students;
		} else {
			throw new IllegalArgumentException("Unsupported file format: " + format);
		}
	}

}
