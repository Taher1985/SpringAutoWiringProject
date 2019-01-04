package com.spring._12javabeanconfiguration;

public class Company {

	private String companyName;

	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String empCompany() {
		return companyName;
	}
}
