package com.oops.inheritance;

public class Person {
	private String name;
	private String address;

	Person() {
		this("Undefined", "Undefined");
	}

	Person(String name) {
		this(name, "Undefined");
	}

	Person(String name, String address) {
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
