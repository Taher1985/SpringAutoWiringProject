package com.spring._04attributeprimarytrue;

public class Employee {

	private String name;
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
