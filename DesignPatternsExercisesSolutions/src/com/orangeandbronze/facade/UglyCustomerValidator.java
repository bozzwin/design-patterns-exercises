package com.orangeandbronze.facade;

public class UglyCustomerValidator {
	/**
	 * Foreigners are VAT-exempt, so use this method to check if customer is a
	 * foreigner to decide whether or not to apply VAT.
	 */
	public boolean isForeigner(Customer customer) {
		return !customer.getCitizenship().equals("FILIPINO");
	}

	/**
	 * Used to checck if customer is senior citizen. Apply senior citizen
	 * discount if so.
	 */
	public boolean isSeniorCitizen(Customer customer) {
		return customer.getAge() > 59;
	}

}
