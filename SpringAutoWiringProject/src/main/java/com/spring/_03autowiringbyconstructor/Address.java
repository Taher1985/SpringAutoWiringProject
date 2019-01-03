package com.spring._03autowiringbyconstructor;

public class Address {

	private String city;
	private String state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String empAddress() {
		return city + " " + state;
	}
}
