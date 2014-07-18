package com.orangeandbronze.template;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class CustomerCsvReaderTest {

	@Test
	public void testGetCustomers() throws Exception {
		File file = new File("resources/customers.csv");
		Set<Customer> resultSet = new CustomerCsvReader().getAll(file);
		Set<Customer> expected = new HashSet<>();
		expected.add(new Customer(14, "Bob", "Makati", "bob@yahoo.com"));
		expected.add(new Customer(19, "Jill", "Pasig", "jill@gmail.com"));
		assertEquals(expected, resultSet);
	}

}
