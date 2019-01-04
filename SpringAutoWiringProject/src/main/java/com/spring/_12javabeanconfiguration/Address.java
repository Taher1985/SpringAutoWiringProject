package com.spring._12javabeanconfiguration;

public class Address {

	private String city;
	private String state;
	private Company company;

	public Address() {
		super();
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String empAddress() {
		return city + " " + state + " and company is " + company.empCompany();
	}
}
