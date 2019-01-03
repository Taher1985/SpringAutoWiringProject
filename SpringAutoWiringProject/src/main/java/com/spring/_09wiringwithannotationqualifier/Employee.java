package com.spring._09wiringwithannotationqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String name;

	@Autowired
	@Qualifier("add1")
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and company name is "
				+ address.empAddress());
	}

}
