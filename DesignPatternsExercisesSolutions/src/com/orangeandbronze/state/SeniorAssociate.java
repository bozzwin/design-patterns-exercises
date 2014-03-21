package com.orangeandbronze.state;

import java.math.BigDecimal;

public class SeniorAssociate extends Level {
	
	SeniorAssociate() {
		super(false,  new BigDecimal("100000.00") );
	}

	@Override
	public BigDecimal getCompensation(Employee emp) {
		return emp.getSalary().add(new BigDecimal(emp.getBillableHours() * 100));
	}

	@Override
	Level nextLevel() {
		return new JuniorPartner();
	}

}
