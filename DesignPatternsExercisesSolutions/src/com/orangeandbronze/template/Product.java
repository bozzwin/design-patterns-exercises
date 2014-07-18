package com.orangeandbronze.template;

import java.math.BigDecimal;

public class Product {
	private final int skuNo;
	private String description;
	private BigDecimal price;

	public Product(int skuNo, String description, BigDecimal price) {
		this.skuNo = skuNo;
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getSkuNo() {
		return skuNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + skuNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (skuNo != other.skuNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [skuNo=" + skuNo + ", description=" + description
				+ ", price=" + price + "]";
	}

}
