package com.orangeandbronze.facade;

public class Customer {
	private int age;
	private String citizenship;
	
	public Customer(int age, String citizenship) {
		this.age = age;
		this.citizenship = citizenship;
	}
	
	int getAge() {
		return age;
	}
	
	String getCitizenship() {
		return citizenship;
	}
	
	
}
