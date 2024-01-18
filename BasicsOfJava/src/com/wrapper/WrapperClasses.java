package com.wrapper;

public class WrapperClasses {

	public static void main(String[] args) {
		// byte --> Byte
		// short --> Short
		// int --> Integer
		// long --> Long
		// double --> Double
		// float --> Float
		// boolean --> Boolean
		// char --> Character

		// create variable primitive data type
//		int primitiveInt = 10;

		// create an object of wrapper class
		// boxing
//		// Integer wrapperInt = new Integer(45);		// boxing --> conversion from primitive to (wrapper class) objects

		// auto boxing
//		Integer wrapperInt = 9854;						// auto boxing 

//		System.out.println("Wrapper value is = " + wrapperInt);

		// un-boxing
//		primitiveInt = wrapperInt.intValue();			// un-boxing --> conversion from (wrapper class) objects to primitive data types

		// auto un-boxing
		// primitiveInt = wrapperInt; // auto un-boxing

		// print minimum and maximum value of byte, short, int and long. Hint :
		// MIN_VALUE and MAX_VALUE

		System.out.println("\nMinimum value of byte is " + Byte.MIN_VALUE);
		System.out.println("Maximum value of byte is " + Byte.MAX_VALUE);

		System.out.println("\nMinimum value of short is " + Short.MIN_VALUE);
		System.out.println("Maximum value of short is " + Short.MAX_VALUE);

		System.out.println("\nMinimum value of int is " + Integer.MIN_VALUE);
		System.out.println("Maximum value of int is " + Integer.MAX_VALUE);

		System.out.println("\nMinimum value of long is " + Long.MIN_VALUE);
		System.out.println("Maximum value of long is " + Long.MAX_VALUE);

		String number = "30";

		// conversion from string to int
		// Integer intValue = Integer.parseInt(number);
		int intValue = Integer.parseInt(number);
		System.out.println("int value is " + intValue);

	}

}
