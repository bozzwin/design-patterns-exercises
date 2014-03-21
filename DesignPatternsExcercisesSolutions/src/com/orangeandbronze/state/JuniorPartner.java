package com.orangeandbronze.state;

import java.math.BigDecimal;

public class JuniorPartner extends Level {
	
	JuniorPartner() {
		super(true,  new BigDecimal("200000.00") );
	}
	

	@Override
	BigDecimal getCompensation(Employee emp) {
		return emp.getSalary().add(Company.getProfit().multiply(
				new BigDecimal("0.01")));
	}


	@Override
	Level nextLevel() {
		return new SeniorPartner();
	}

}
