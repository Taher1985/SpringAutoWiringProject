package com.spring._12javabeanconfiguration;

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
		employee.setName("Taher"); // Setter based DI
		employee.setAddress(address()); // Setter based DI
		return employee;
	}

	@Bean
	public Company company() {
		Company company = new Company("CSC"); // Constructor based DI
		return company;
	}
	
	@Bean
	public Address address() {
		Address address = new Address("Chennai", "TN"); // Constructor based DI
		address.setCompany(company()); // Setter based DI
		return address;
	}
	
	@Bean
	public Employee employee1() {
		Employee employee = new Employee();
		employee.setName("Ali"); // Setter based DI
		employee.setAddress(address()); // Setter based DI
		return employee;
	}
}
