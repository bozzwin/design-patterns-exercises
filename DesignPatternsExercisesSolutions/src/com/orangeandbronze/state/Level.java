package com.orangeandbronze.state;

import java.math.BigDecimal;

public abstract class Level {
	final boolean hasParking;
	final BigDecimal healthCoverage;
	
	Level(boolean hasParking, BigDecimal healthCoverage) {
		this.hasParking = hasParking;
		this.healthCoverage = healthCoverage;
	}
	
	abstract BigDecimal getCompensation(Employee emp);
	
	abstract Level nextLevel();
	
	@Override
	public boolean equals(Object o) {
		return o.getClass().equals(this.getClass());
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}
	

}