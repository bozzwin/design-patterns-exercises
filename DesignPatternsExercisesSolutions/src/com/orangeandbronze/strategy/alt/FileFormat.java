package com.orangeandbronze.strategy.alt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

enum FileFormat {
	XML {
		List<Student> unmarshal(File file) throws Exception {
			JAXBContext jc = JAXBContext.newInstance(Wrapper.class,
					Student.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			StreamSource xml = new StreamSource(file);
			Wrapper<Student> wrapper = (Wrapper<Student>) unmarshaller
					.unmarshal(xml, Wrapper.class).getValue();
			return wrapper.getItems();
		}
	}, 
	
	CSV {
		List<Student> unmarshal(File file) throws Exception {
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
	};
	
	abstract List<Student> unmarshal(File file) throws Exception;

}