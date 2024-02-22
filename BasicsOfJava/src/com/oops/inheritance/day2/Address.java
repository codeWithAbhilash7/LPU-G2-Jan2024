package com.oops.inheritance.day2;

public class Address {
	private String city;
	private String state;

	Address() {
		this("Undefined", "Undefined");
	}

	Address(String city, String address) {
		this.city = city;
		this.state = address;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
