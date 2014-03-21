package com.orangeandbronze.adapter2.theirs;

import java.io.*;

import java.util.*;
import javax.xml.bind.*;
import javax.xml.transform.stream.StreamSource;

/**  
 * Replace the default Outputter implementation
 * with the CsvOutputter by wrapping it in an adapter
 */
public class StudentService {
	private Outputter outputter;
	
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}
	
	public void dump(List<Student> students) {
		outputter.output(students);
	}


}
