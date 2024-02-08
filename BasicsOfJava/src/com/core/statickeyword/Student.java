package com.core.statickeyword;

public class Student {
	private int rollNumber;
	private String name;

	private static int count = 0;

	public Student(int rollNumber, String name) {
		this.name = name;
		this.rollNumber = rollNumber;
		count++;
	}

	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void nonStaticMethod() {
		// non static data --> non static method
		System.out.println(this.rollNumber);

		// static data --> non static method
		System.out.println("Non static method " + count);
	}

	static void staticMethod() {
		// static data --> static method
		System.out.println("Non static method " + count);

		// non static data --> static method
		// System.out.println(this.rollNumber);

	}

	public static int getCount() {
		return count;
	}
	
	
	
	

}
