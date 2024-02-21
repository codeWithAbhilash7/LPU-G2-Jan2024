package com.oops.inheritance.day2;

public class Student extends Person {
	private static int idGenerator;
	private int id;

	private double english;
	private double hindi;

	static {
		idGenerator = 100;
	}

	public Student(String name) {
		this(name, "Undefined");
	}

	public Student(String name, String address) {
		super(name, address); // call parent class matching constructor
		this.english = 0;
		this.hindi = 0;
		this.id = ++idGenerator;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + getName() + ", english=" + english + ", hindi=" + hindi + ", total="
				+ getTotalMarks() + ", avg=" + getAverage() + "]";
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

	public static int getTotalCount() {
		return idGenerator - 100;
	}

	public int getId() {
		return id;
	}

}
