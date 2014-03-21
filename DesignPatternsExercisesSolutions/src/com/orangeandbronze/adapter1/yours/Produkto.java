package com.orangeandbronze.adapter1.yours;

import java.math.BigDecimal;

/**
 * Create a ProductAdapter that would allow your Produkto class to be used with
 * the PurchasingService
 */
public class Produkto {
	private final int skuNumber;
	private String pangalan;
	private BigDecimal presyo;

	public Produkto(int skuNumber, String pangalan, BigDecimal presyo) {
		this.skuNumber = skuNumber;
		this.pangalan = pangalan;
		this.presyo = presyo;
	}

	public BigDecimal getPresyo() {
		return presyo;
	}

	public void setPresyo(BigDecimal presyo) {
		this.presyo = presyo;
	}

	public int getSkuNumber() {
		return skuNumber;
	}

	public String getPangalan() {
		return pangalan;
	}

	public void setPangalan(String pangalan) {
		this.pangalan = pangalan;
	}

}
