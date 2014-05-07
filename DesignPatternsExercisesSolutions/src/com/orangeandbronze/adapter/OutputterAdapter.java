package com.orangeandbronze.adapter;

import java.util.List;

import com.orangeandbronze.adapter.theirs.Outputter;
import com.orangeandbronze.adapter.theirs.Student;
import com.orangeandbronze.adapter.yours.CsvOutputter;

public class OutputterAdapter extends Outputter {
	private CsvOutputter outputter = new CsvOutputter();
	
	@Override
	public void output(List<Student> students) {
		outputter.csvOut(students);
	}
	

}
