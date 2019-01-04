package com.spring._13javabeanconfigurationautowired;

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
