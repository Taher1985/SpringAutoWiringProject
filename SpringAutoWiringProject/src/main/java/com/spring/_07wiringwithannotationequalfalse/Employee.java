package com.spring._07wiringwithannotationequalfalse;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String name;

	@Autowired(required = false)
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and company name is "
				+ address.empAddress());
	}

}
