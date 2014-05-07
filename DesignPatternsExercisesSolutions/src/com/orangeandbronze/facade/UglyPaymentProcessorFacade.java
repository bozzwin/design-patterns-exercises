package com.orangeandbronze.facade;

import java.math.BigDecimal;

public class UglyPaymentProcessorFacade {

	private UglyPaymentProcessor uglyProcessor = new UglyPaymentProcessor();
	private UglyCustomerValidator uglyValidator = new UglyCustomerValidator();

	public BigDecimal createBill(Customer customer, BigDecimal baseAmount) {
		if (uglyValidator.isForeigner(customer)) {
			return uglyProcessor.createBillVatFree(baseAmount);
		} else if (uglyValidator.isSeniorCitizen(customer)) {
			return uglyProcessor.createBillSeniorCitizen(baseAmount);
		} else {
			return uglyProcessor.createBilWithVatl(baseAmount);
		}
	}

}
