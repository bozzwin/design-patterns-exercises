package com.orangeandbronze.state;

import java.math.BigDecimal;

/**
 * Refactor this class so that it eliminates the switch statements by using
 * State Pattern. 
 * 
 * Hint: Push the varying behaviors into Level. You can turn
 * Level into an abstract class and then have the varying behaviors in each
 * subclass, or you can keep Level as an enum but with each instance having
 * varying behaviors by means of anonymous classes.
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
		switch (level) {
		case JUNIOR_ASSOCIATE:
			return salary;
		case SENIOR_ASSOCIATE:
			// salary + billable hours x 100
			return salary.add(new BigDecimal(billableHours * 100));
		case JUNIOR_PARTNER:
			// salary + company profit x 1%
			return salary.add(Company.getProfit().multiply(
					new BigDecimal("0.01")));
		case SENIOR_PARTNER:
			// salary + company profit x 5%
			return salary.add(Company.getProfit().multiply(
					new BigDecimal("0.05")));
		default:
			throw new IllegalStateException("level attribute is null");
		}

	}

	public void promote() {
		switch (level) {
		case JUNIOR_ASSOCIATE:
			level = Level.SENIOR_ASSOCIATE;
			break;
		case SENIOR_ASSOCIATE:
			level = Level.JUNIOR_PARTNER;
			break;
		case JUNIOR_PARTNER:
			level = Level.SENIOR_PARTNER;
			break;
		case SENIOR_PARTNER:
			break;
		default:
			throw new IllegalStateException("level attribute is null");
		}
	}

	public boolean hasParkingSpace() {
		switch (level) {
		case JUNIOR_ASSOCIATE:
			return false;
		case SENIOR_ASSOCIATE:
			return false;
		case JUNIOR_PARTNER:
			return true;
		case SENIOR_PARTNER:
			return true;
		default:
			throw new IllegalStateException("level attribute is null");
		}
	}

	public BigDecimal getHealthCoverage() {
		switch (level) {
		case JUNIOR_ASSOCIATE:
			return new BigDecimal("50000.00");
		case SENIOR_ASSOCIATE:
			return new BigDecimal("100000.00");
		case JUNIOR_PARTNER:
			return new BigDecimal("200000.00");
		case SENIOR_PARTNER:
			return new BigDecimal("400000.00");
		default:
			throw new IllegalStateException("level attribute is null");
		}
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
