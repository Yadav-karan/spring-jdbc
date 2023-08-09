package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
	
	private Address address;
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void say() {
		address.lives();
		System.out.println("Saying something");
	}
}
