package com.orangeandbronze.facade;

import java.math.BigDecimal;

/**
 * Create a facade that hides the complexity
 * of this class behind just one method.
 */
public class UglyPaymentProcessor {
	
	/**
	 * Regular bill creation - adds 12% VAT to baseAmount
	 */
	public BigDecimal createOrdinaryBill(BigDecimal baseAmount) {
		return baseAmount.multiply(new BigDecimal("1.12"));
	}
	
	/**
	 * Foreigners are VAT-exempt, so use this method to check 
	 * if customer is a foreigner to decide whether or not to
	 * apply VAT.
	 */
	public boolean isForeigner(Customer customer) {
		return customer.isForeigner();
	}
	
	/**
	 * VAT-free bill for foreigners.  Just returns base amount.
	 */
	public BigDecimal createBillVatFree(BigDecimal baseAmount) {
		return baseAmount;
	}
	
	/**
	 * Used to checck if customer is senior citizen. Apply
	 * senior citizen discount if so.
	 */
	public boolean isSeniorCitizen(Customer customer) {
		return customer.getAge() > 59;
	}
	
	/**
	 * Bill for senior citizens - 20% discount and no VAT.
	 */
	public BigDecimal createBillSeniorCitizen(BigDecimal baseAmount) {
		return baseAmount.multiply(new BigDecimal("0.80"));
	}

}
