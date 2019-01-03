package com.spring._04attributeprimarytrue;

public class Address1 implements Address {

	private String city;
	private String state;

	public Address1(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String empAddress() {
		return city + " " + state;
	}
}
