package com.orangeandbronze.strategy;

import java.io.File;
import java.util.List;

/** 
 * Use the Strategy pattern by adding a setter or constructor
 * that passes in the proper strategy for parsing
 * the file format 
 */
public class StudentService {
	private FileFormat format;
	
	StudentService(FileFormat format) {
		this.format = format;
	}
	
	void setFileFormat(FileFormat format) {
		this.format = format;
	}
	
	List<Student> getStudents(File file) throws Exception {
		return format.unmarshal(file);
	}

}
