package com.orangeandbronze.state;

import static org.junit.Assert.*;
import static com.orangeandbronze.state.Level.*;

import java.math.BigDecimal;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void compensationOfJuniorAssociate() {
		BigDecimal SALARY = new BigDecimal("20000.00");
		Employee juniorAssociate = new Employee(121, JUNIOR_ASSOCIATE, SALARY);
		juniorAssociate.setBillableHours(200);
		assertEquals(SALARY, juniorAssociate.getCompensation());
	}
	
	@Test
	public void parkingSpaceOfJuniorAssociate() {
		Employee juniorAssociate = new Employee(121, JUNIOR_ASSOCIATE, new BigDecimal("20000.00"));
		assertFalse(juniorAssociate.hasParkingSpace());		
	}
	
	@Test
	public void healthCoverageOfJuniorAssociate() {
		Employee juniorAssociate = new Employee(121, JUNIOR_ASSOCIATE, new BigDecimal("20000.00"));
		assertEquals(new BigDecimal("50000.00"), juniorAssociate.getHealthCoverage());
	}
	
	@Test
	public void promoteJuniorAssociate() {
		Employee juniorAssociate = new Employee(121, JUNIOR_ASSOCIATE, new BigDecimal("20000.00"));
		juniorAssociate.promote();
		assertEquals(SENIOR_ASSOCIATE, juniorAssociate.getLevel());
	}
	
	@Test
	public void compensationOfSeniorAssociate() {
		BigDecimal SALARY = new BigDecimal("50000.00");
		Employee seniorAssociate = new Employee(99, SENIOR_ASSOCIATE, SALARY);
		int BILLABLE_HOURS = 160;
		seniorAssociate.setBillableHours(BILLABLE_HOURS);
		assertEquals(SALARY.add(new BigDecimal(BILLABLE_HOURS * 100)), seniorAssociate.getCompensation());
	}
	
	@Test
	public void parkingSpaceOfSeniorAssociate() {
		Employee seniorAssociate = new Employee(99, SENIOR_ASSOCIATE, new BigDecimal("50000.00"));
		assertFalse(seniorAssociate.hasParkingSpace());		
	}
	
	@Test
	public void healthCoverageOfSeniorAssociate() {
		Employee seniorAssociate = new Employee(99, SENIOR_ASSOCIATE, new BigDecimal("50000.00"));
		assertEquals(new BigDecimal("100000.00"), seniorAssociate.getHealthCoverage());
	}
	
	@Test
	public void promoteSeniorAssociate() {
		Employee seniorAssociate = new Employee(99, SENIOR_ASSOCIATE, new BigDecimal("50000.00"));
		seniorAssociate.promote();
		assertEquals(JUNIOR_PARTNER, seniorAssociate.getLevel());
	}
	
	@Test
	public void compensationOfJuniorPartner() {
		BigDecimal SALARY = new BigDecimal("100000.00");
		Employee seniorAssociate = new Employee(29, JUNIOR_PARTNER, SALARY);
		assertEquals(SALARY.add(Company.getProfit().multiply(new BigDecimal("0.01"))), seniorAssociate.getCompensation());
	}
	
	@Test
	public void parkingSpaceOfJuniorPartner() {
		Employee seniorAssociate = new Employee(29, JUNIOR_PARTNER, new BigDecimal("100000.00"));
		assertTrue(seniorAssociate.hasParkingSpace());		
	}
	
	@Test
	public void healthCoverageOfJuniorPartner() {
		Employee seniorAssociate = new Employee(29, JUNIOR_PARTNER, new BigDecimal("100000.00"));
		assertEquals(new BigDecimal("200000.00"), seniorAssociate.getHealthCoverage());
	}
	
	@Test
	public void promoteJuniorPartner() {
		Employee seniorAssociate = new Employee(29, JUNIOR_PARTNER, new BigDecimal("100000.00"));
		seniorAssociate.promote();
		assertEquals(SENIOR_PARTNER, seniorAssociate.getLevel());
	}
	
	@Test
	public void compensationOfSeniorPartner() {
		BigDecimal SALARY = new BigDecimal("200000.00");
		Employee seniorAssociate = new Employee(4, SENIOR_PARTNER, SALARY);
		assertEquals(SALARY.add(Company.getProfit().multiply(new BigDecimal("0.05"))), seniorAssociate.getCompensation());
	}
	
	@Test
	public void parkingSpaceOfSeniorPartner() {
		Employee seniorAssociate = new Employee(4, SENIOR_PARTNER, new BigDecimal("200000.00"));
		assertTrue(seniorAssociate.hasParkingSpace());		
	}
	
	@Test
	public void healthCoverageOfSeniorPartner() {
		Employee seniorAssociate = new Employee(4, SENIOR_PARTNER, new BigDecimal("200000.00"));
		assertEquals(new BigDecimal("400000.00"), seniorAssociate.getHealthCoverage());
	}
	
	@Test
	public void promoteSeniorPartner() {
		Employee seniorAssociate = new Employee(4, SENIOR_PARTNER, new BigDecimal("200000.00"));
		seniorAssociate.promote();
		assertEquals(SENIOR_PARTNER, seniorAssociate.getLevel());
	}

}
