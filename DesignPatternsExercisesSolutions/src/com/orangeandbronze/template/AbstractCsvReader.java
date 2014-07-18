package com.orangeandbronze.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractCsvReader<T> {
	
	public Set<T> getAll(File file) throws IOException {
		Set<T> returnSet = new HashSet<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){			
			String line = reader.readLine();
			while (line != null && !line.trim().equals("")) {
				String[] tokens = line.split("\\s*,\\s*");
				T element = unmarshall(tokens);
				returnSet.add(element);
				line = reader.readLine();
			}
		}
		return returnSet;
	}

	abstract T unmarshall(String[] tokens);
	


}
