package com.orangeandbronze.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CustomerCsvReader {
	
	Set<Customer> getCustomers(File file) throws IOException {
		Set<Customer> returnSet = new HashSet<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){			
			String line = reader.readLine();
			while (line != null && !line.trim().equals("")) {
				String[] tokens = line.split("\\s*,\\s*");
				Customer customer = new Customer(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3]);
				returnSet.add(customer);
				line = reader.readLine();
			}
		}
		return returnSet;
	}
}
