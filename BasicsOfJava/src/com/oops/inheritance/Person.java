package com.oops.inheritance;

public class Person {
	private String name;
	private Address address; // aggregation/containment/composition

	public Person(String name) {
		this(name, "", "");
	}

	public Person(String name, String city, String state) {
		this.name = name;
		this.address = new Address(city, state);
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
