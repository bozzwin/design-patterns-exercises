package com.orangeandbronze.facade;

import java.math.BigDecimal;

public class UglyPaymentProcessorFacade {
	
	private UglyPaymentProcessor ugly = new UglyPaymentProcessor();
	
	public BigDecimal createBill(Customer customer, BigDecimal baseAmount) {
		if (ugly.isSeniorCitizen(customer)) {
			return ugly.createBillSeniorCitizen(baseAmount);
		} else if (customer.isForeigner()) {
			return ugly.createBillVatFree(baseAmount);
		} else {
			return ugly.createOrdinaryBill(baseAmount);
		}
	}

}
