package com.spring._06wiringwithannotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String name;

	@Autowired
	private Address address;

	private Company company;

	@Autowired
	public Employee(Company company) {
		super();
		this.company = company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and company name is "
				+ company.empCompany() + " and address is "
				+ address.empAddress());
	}

}
