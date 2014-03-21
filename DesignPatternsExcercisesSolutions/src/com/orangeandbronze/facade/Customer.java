package com.orangeandbronze.facade;

public class Customer {
	private int age;
	private boolean isForeigner;
	
	public Customer(int age, boolean isForeigner) {
		this.age = age;
		this.isForeigner = isForeigner;
	}
	
	int getAge() {
		return age;
	}
	
	boolean isForeigner() {
		return isForeigner;
	}
	
	
}
