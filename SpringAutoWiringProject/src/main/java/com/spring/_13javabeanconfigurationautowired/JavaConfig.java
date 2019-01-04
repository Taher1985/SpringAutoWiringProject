package com.spring._13javabeanconfigurationautowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	public JavaConfig() {
		super();
	}

	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setName("Taher");
		employee.setAddress(new Address());
		return employee;
	}

	@Bean
	public Company company() {
		Company company = new Company("CSC");
		return company;
	}

	@Bean
	public Address address() {
		Address address = new Address();
		return address;
	}

}
