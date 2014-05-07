package com.orangeandbronze.state.alt;

import java.math.BigDecimal;


public enum Level {
	JUNIOR_ASSOCIATE (false, new BigDecimal("50000.00")){
		
		BigDecimal getCompensation(Employee emp) {
			return emp.getSalary();
		}
		
		Level nextLevel() {
			return SENIOR_ASSOCIATE;
		}
		
	}, 
	SENIOR_ASSOCIATE(false,  new BigDecimal("100000.00") ) {
		BigDecimal getCompensation(Employee emp) {
			return emp.getSalary().add(new BigDecimal(emp.getBillableHours() * 100));
		}

		Level nextLevel() {
			return JUNIOR_PARTNER;
		}
	}, 
	JUNIOR_PARTNER(true, new BigDecimal("200000.00") ) {
		BigDecimal getCompensation(Employee emp) {
			return emp.getSalary().add(Company.getProfit().multiply(
					new BigDecimal("0.01")));
		}

		Level nextLevel() {
			return SENIOR_PARTNER;
		}
	}, 
	SENIOR_PARTNER(true, new BigDecimal("400000.00") ) {
		BigDecimal getCompensation(Employee emp) {
			return emp.getSalary().add(Company.getProfit().multiply(
					new BigDecimal("0.05")));
		}
		
		Level nextLevel() {
			return this;
		}
	};
	
	Level(boolean hasParking, BigDecimal healthCoverage) {
		this.hasParking = hasParking;
		this.healthCoverage = healthCoverage;
	}
	
	final boolean hasParking;
	final BigDecimal healthCoverage;

	abstract BigDecimal getCompensation(Employee emp);
	
	abstract Level nextLevel();
}