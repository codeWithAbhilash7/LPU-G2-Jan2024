package com.exceptions;

public class AssertDemo {

	public static void main(String[] args) {
		double marks = 45;
		assert marks > 0 : "Invalid marks";

		System.out.println("Marks are " + marks);
	}

}
