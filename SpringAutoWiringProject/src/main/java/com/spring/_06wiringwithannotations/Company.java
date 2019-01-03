package com.spring._06wiringwithannotations;

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
