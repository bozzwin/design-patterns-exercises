package com.orangeandbronze.template;

import java.math.BigDecimal;

public class ProductCsvReader extends AbstractCsvReader<Product> {
	
	@Override
	Product unmarshall(String[] tokens) {
		Product product = new Product(Integer.parseInt(tokens[0]), tokens[1], new BigDecimal(tokens[2]));
		return product;
	}
	


}
