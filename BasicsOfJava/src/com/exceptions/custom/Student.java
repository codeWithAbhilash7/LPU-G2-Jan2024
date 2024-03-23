package com.exceptions.custom;

public class Student {
	private String name;
	private double marks;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name, double marks) throws MarksOutOfBoundsExceptions {
		super();
		System.out.println("executing constructor..");
		this.name = name;
		if (marks < 0 || marks > 100) {
			//throw new MarksOutOfBoundsExceptions();
			throw new MarksOutOfBoundsExceptions("Marks must be between 0-100 range");
		}
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) throws MarksOutOfBoundsExceptions {
		if (marks < 0 || marks > 100) {
			//throw new MarksOutOfBoundsExceptions();
			throw new MarksOutOfBoundsExceptions("Marks must be between 0-100 range");
		}
		this.marks = marks;
	}

}
