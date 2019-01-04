package com.spring._03autowiringbyconstructor;

public class Employee {

	private String name;
	private Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and address is "
				+ address.empAddress());
	}

}
