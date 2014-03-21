package com.orangeandbronze.adapter1;

import java.math.BigDecimal;

import com.orangeandbronze.adapter1.theirs.Product;
import com.orangeandbronze.adapter1.yours.Produkto;

public class ProductAdapter extends Product {
	
	private Produkto produkto;

	public ProductAdapter(Produkto produkto) {
		super(produkto.getSkuNumber(), produkto.getPangalan(), produkto.getPresyo());
		this.produkto = produkto;
	}

	@Override
	public String getName() {
		return produkto.getPangalan();
	}

	@Override
	public void setName(String name) {
		produkto.setPangalan(name);
	}

	@Override
	public BigDecimal getPrice() {
		return produkto.getPresyo();
	}

	@Override
	public void setPrice(BigDecimal price) {
		produkto.setPresyo(price);
	}

	@Override
	public int getProductId() {
		return produkto.getSkuNumber();
	}

}
