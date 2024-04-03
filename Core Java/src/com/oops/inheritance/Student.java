package com.oops.inheritance;

public class Student extends Person {
	private static int idGenerator;
	private int id;

	private double english;
	private double hindi;

	static {
		idGenerator = 0;
	}

	// parameterized constructor
	public Student(String name) {
		this(name, "Undefined");
	}

	// parameterized constructor
	public Student(String name, String address) {
		super(name, address);		// call parent class matching constructor
		this.id = ++idGenerator;
		this.english = 0;
		this.hindi = 0;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + getName() + ", address="
				+ getAddress() + ", english=" + english + ", hindi=" + hindi + "]";
	}

	/**
	 * @return total marks obtained by a student
	 */
	public double getTotalMarks() {
		return this.hindi + this.english;
	}

	/**
	 * @return average marks obtained by a student
	 */
	public double getAverage() {
		return this.getTotalMarks() / 2.0;
	}

	public int getId() {
		return id;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getHindi() {
		return hindi;
	}

	public void setHindi(double hindi) {
		this.hindi = hindi;
	}

}
