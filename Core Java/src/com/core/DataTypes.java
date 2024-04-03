package com.core;

public class DataTypes {

	public static void main(String[] args) {

		// integral data types
		// numbers without decimals --> 34, 54, -87, 34563456, 7654562 
		// byte -> 1 byte -> 8 bits
		// short -> 2 byte -> 16 bits
		// int -> 4 bytes
		// long -> 8 bytes

		// byte --> 2^8 --> 256 / 2 --> -128 to 127
		// short --> 2^16 --> 65536 / 2 --> -32,768 to 32,767
		// int --> -2,147,483,648 to 2,147,483,647
		// long --> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

		byte bVal = 127;
		System.out.println("Byte value is :: " + bVal);

		short sVal = -30566;
		System.out.println("Short value is :: " + sVal);

		int iVal = 3450566;
		System.out.println("Int value is :: " + iVal);

		long lVal = 345683748;
		System.out.println("Long value is :: " + lVal);

		// floating point data types
		// numbers with decimals --> 834.54, 23.55, 3.14, -45.76
		// float --> 4 byte --> precision 1 decimal point
		// double --> 8 byte --> precision 2 decimal point

		double doubleValue = 3.14153456;
		System.out.println("\nDouble value is " + doubleValue);

		float floatValue = 3.14153456f;
		System.out.println("Float value is " + floatValue);

		// characters --> a, t, g, e, @, *
		char charValue = 'h';
		System.out.println("\nChar value is :: " + charValue);

		// boolean --> true or false
		boolean boolVal = true;
		System.out.println("\nBoolean value is :: " + boolVal);

		// names, address --> "Sachin", "Gandhi Road", "New Delhi", "Mumbai"

	}

}
