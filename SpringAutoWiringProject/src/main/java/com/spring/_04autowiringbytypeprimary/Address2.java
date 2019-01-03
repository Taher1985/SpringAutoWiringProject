package com.spring._04autowiringbytypeprimary;

public class Address2 implements Address {

	private String city;
	private String state;

	public Address2(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String empAddress() {
		return city + " " + state;
	}
}
