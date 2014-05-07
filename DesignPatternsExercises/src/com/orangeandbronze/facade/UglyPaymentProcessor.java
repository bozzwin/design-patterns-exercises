package com.orangeandbronze.facade;

import java.math.BigDecimal;

/**
 * Create a facade that hides the complexity of this class behind just one
 * method.
 */
public class UglyPaymentProcessor {

	/**
	 * Regular bill creation - adds 12% VAT to baseAmount
	 */
	public BigDecimal createBilWithVatl(BigDecimal baseAmount) {
		return baseAmount.multiply(new BigDecimal("1.12"));
	}

	/**
	 * VAT-free bill for foreigners. Just returns base amount.
	 */
	public BigDecimal createBillVatFree(BigDecimal baseAmount) {
		return baseAmount;
	}

	/**
	 * Bill for senior citizens - 20% discount and no VAT.
	 */
	public BigDecimal createBillSeniorCitizen(BigDecimal baseAmount) {
		return baseAmount.multiply(new BigDecimal("0.80"));
	}

}
