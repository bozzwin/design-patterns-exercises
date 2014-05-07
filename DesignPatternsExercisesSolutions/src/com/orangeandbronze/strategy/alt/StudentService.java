package com.orangeandbronze.strategy.alt;

import java.io.File;
import java.util.List;

/** 
 * Use the Strategy pattern by adding a setter or constructor
 * that passes in the proper strategy for parsing
 * the file format 
 */
public class StudentService {
	
	List<Student> getStudents(File file, FileFormat format) throws Exception {
		return format.unmarshal(file);
	}

}
