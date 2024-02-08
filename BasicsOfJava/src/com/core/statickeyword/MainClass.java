package com.core.statickeyword;

public class MainClass {

	public static void greet() {
		System.out.println("");
	}

	/**
	 * public : accessible from anywhere (same package or different package) static
	 * static : class level member 	- no need of object creation to call this method/data
	 * 								- can be called using class name	  			
	 * void : returns nothing
	 * main : identifier (method name)
	 * String[] : Array of String
	 * args : identifier (name of the arguments) 
	 */

	public static void main(String[] args) {

		// greet();

		System.out.println(Student.getCount());

//		Student s1 = new Student(1, "Rahul");
//		System.out.println(s1.count);

//		Student s2 = new Student(2, "Ganesh");
//		System.out.println(s2.count);
//
//		Student s3 = new Student(3, "Dinesh");
//		System.out.println(s3.count);
//
//		Student s4 = new Student(4, "Mangesh");
//		System.out.println(s4.count);
//
//		Student s5 = new Student(5, "Lokesh");
//		System.out.println(s5.count);
//
//		Student s6 = new Student(5, "Sandesh");
//		System.out.println(s6.count);

		System.out.println(Student.getCount());

	}

}
