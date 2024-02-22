package com.oops.inheritance.day2;

// Object

public class Person {
	private String name;
//	private String address;

	private Address address;

	Person(String name, String city, String address) {
		this.name = name;
		this.address = new Address(city, address);
	}

	Person(String name) {
		this.name = name;
		this.address = new Address();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public String getCity() {
//		return address.getCity();
//	}
//	
//	public void setCity(String city) {
//		this.address.setCity(city);
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
