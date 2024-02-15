package com.oops.inheritance;

public class Student extends Person {
	private static int nextId;

	private int id;
	private double totalMarks;

	static {
		nextId = 101;
	}

	public Student(String name) {
		super(name);
		id = nextId++;
		totalMarks = 0;
	}

	public Student(String name, String city, String state) {
		super(name, city, state);
		id = nextId++;
		totalMarks = 0;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + getName() + ", Address=" + getAddress()
				+ ", totalMarks=" + totalMarks + "]";
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public static int getNextId() {
		return nextId;
	}

	public int getId() {
		return id;
	}

}
