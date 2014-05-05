package com.orangeandbronze.adapter2;

import java.util.List;

import com.orangeandbronze.adapter2.theirs.Outputter;
import com.orangeandbronze.adapter2.theirs.Student;
import com.orangeandbronze.adapter2.yours.CsvOutputter;

public class OutputterAdapter extends Outputter {
	private CsvOutputter outputter = new CsvOutputter();
	
	@Override
	public void output(List<Student> students) {
		outputter.csvOut(students);
	}
	

}
