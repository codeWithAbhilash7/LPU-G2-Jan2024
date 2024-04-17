package com.collections;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double marks;

	@Override
	public boolean equals(Object obj) {
		if (this.id == ((Student) obj).getId())
			return true;
		return false;
	}

	@Override
	public int compareTo(Student o) {
		return this.id - o.id;
	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setMarks(double marks) {
		this.marks = marks;
	}

}
