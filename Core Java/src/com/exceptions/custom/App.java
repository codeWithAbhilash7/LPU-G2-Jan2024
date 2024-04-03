package com.exceptions.custom;

public class App {

	public static void main(String[] args) {
		Student s1 = null;
		try {
			s1 = new Student("Rahul");
			s1.setMarks(145);
		} catch (MarksOutOfBoundsExceptions e) {
			e.printStackTrace();
			// System.out.println(e);
			// System.err.println(e.getMessage());
		}

		System.out.println(s1);
	}

}
