package com.core.statickeyword;

public class Student {
	private int rollNumber;
	private String name;

	private static int count = 0;

	// Initializer blocks
	{
		// this block will get called every time with new object creation (before the
		// constructor)
		System.out.println("Initializer block");
	}

	// static Initializer blocks
	static {
		// this block will get called ONLY ONCE (at the time of class loading)
		System.out.println("static Initializer block");
	}

	public Student(int rollNumber, String name) {
		System.out.println("Constructor");
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
