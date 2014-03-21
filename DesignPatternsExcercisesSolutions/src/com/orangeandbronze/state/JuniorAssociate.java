package com.orangeandbronze.state;

import java.math.BigDecimal;

public class JuniorAssociate extends Level {
	
	JuniorAssociate() {
		super(false, new BigDecimal("50000.00") );
	}

	@Override
	BigDecimal getCompensation(Employee emp) {
		return emp.getSalary();
	}
	
	@Override
	Level nextLevel() {
		return new SeniorAssociate();
	}
	
}
