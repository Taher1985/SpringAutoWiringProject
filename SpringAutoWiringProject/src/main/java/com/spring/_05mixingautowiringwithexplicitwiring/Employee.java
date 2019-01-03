package com.spring._05mixingautowiringwithexplicitwiring;

public class Employee {

	private String name;
	private Address address1;
	private Address address2;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public void setAddress2(Address address2) {
		this.address2 = address2;
	}

	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and address1 is "
				+ address1.empAddress() + " and address2 is "
				+ address2.empAddress());
	}

}
