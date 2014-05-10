package com.orangeandbronze.template;

import static org.junit.Assert.*;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ProductCsvReaderTest {

	@Test
	public void testGetProducts() throws Exception {
		File file = new File("resources/products.csv");
		Set<Product> resultSet = new ProductCsvReader().getProducts(file);
		Set<Product> expected = new HashSet<>();
		expected.add(new Product(24, "Refrigerator", new BigDecimal("24000")));
		expected.add(new Product(79, "Toaster", new BigDecimal("2000")));
		assertEquals(expected, resultSet);
	}

}
