package com.orangeandbronze.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class CustomerCsvReader extends AbstractCsvReader<Customer> {
	
	@Override
	Customer unmarshall(String[] tokens) {
		Customer customer = new Customer(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3]);
		return customer;
	}
	
	
}
