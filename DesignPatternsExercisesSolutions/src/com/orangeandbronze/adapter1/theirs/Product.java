package com.orangeandbronze.adapter1.theirs;

import java.math.BigDecimal;

public class Product {
	private final int productId;
	private String name;
	private BigDecimal price;

	public Product(int productId, String name, BigDecimal price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

}
