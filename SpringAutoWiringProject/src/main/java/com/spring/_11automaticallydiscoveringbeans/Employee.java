package com.spring._11automaticallydiscoveringbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value(value = "${name}")
	private String name;

	@Autowired
	private Address address;

	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and address is "
				+ address.empAddress());
	}

}
