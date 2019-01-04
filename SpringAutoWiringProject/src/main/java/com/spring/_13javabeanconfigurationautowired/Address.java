package com.spring._13javabeanconfigurationautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // @Component annotation suppress @Bean annotation, thus Address object got created due to @Component not by @Bean in JavConfig
public class Address {

	private String city;
	private String state;
	private Company company;

	public Address() {
		super();
	}


	@Autowired
	public Address(Company company) {
		super();
		this.company = company;
	}


	public String empAddress() {
		return city + " " + state + " and company is " + company.empCompany();
	}
}
