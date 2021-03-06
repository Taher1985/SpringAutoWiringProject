package com.spring._13javabeanconfigurationautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Employee {

	private String name;

	@Autowired
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and address is "
				+ address.empAddress());
	}

}
