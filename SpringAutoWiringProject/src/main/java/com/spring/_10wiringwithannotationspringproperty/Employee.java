package com.spring._10wiringwithannotationspringproperty;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value(value = "Taher")
	private String name;

	@Value(value = "${name}")
	private String nameFromPropertyFile;

	public void employeeName() {
		System.out.println("Employee name is " + name + " "
				+ nameFromPropertyFile);
	}

}
