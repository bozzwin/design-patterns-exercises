package com.orangeandbronze.state;

import java.math.BigDecimal;

public class SeniorPartner extends Level {
	
	SeniorPartner() {
		super(true, new BigDecimal("400000.00") );
	}

	@Override
	BigDecimal getCompensation(Employee emp) {
		return emp.getSalary().add(Company.getProfit().multiply(
				new BigDecimal("0.05")));
	}
	
	@Override
	Level nextLevel() {
		return this;
	}
}
