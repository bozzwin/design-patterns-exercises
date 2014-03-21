package com.orangeandbronze.state;

import java.math.BigDecimal;

/**
 * Refactor this class so that it eliminates the switch statements by using
 * State Pattern. 
 */
public class Employee {

	private Level level;
	private BigDecimal salary;
	private final int employeeNumber;
	private int billableHours;

	public Employee(int employeeNumber, Level level, BigDecimal salary) {
		this.level = level;
		this.salary = salary;
		this.employeeNumber = employeeNumber;
	}

	public BigDecimal getCompensation() {
		return level.getCompensation(this);

	}

	public void promote() {
		level = level.nextLevel();
	}

	public boolean hasParkingSpace() {
		return level.hasParking;
	}

	public BigDecimal getHealthCoverage() {
		return level.healthCoverage;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getBillableHours() {
		return billableHours;
	}

	public void setBillableHours(int billableHours) {
		this.billableHours = billableHours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (employeeNumber != other.employeeNumber) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "employee# " + employeeNumber;
	}

}
