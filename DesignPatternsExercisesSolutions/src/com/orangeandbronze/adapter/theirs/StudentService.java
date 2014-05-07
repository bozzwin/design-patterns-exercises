package com.orangeandbronze.adapter.theirs;

import java.io.*;

import java.util.*;
import javax.xml.bind.*;
import javax.xml.transform.stream.StreamSource;

/**  
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
