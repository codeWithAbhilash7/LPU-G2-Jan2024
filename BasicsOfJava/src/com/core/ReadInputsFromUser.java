package com.core;

import java.util.Scanner;

// import java.lang.*;  --> default import (no need to import this package)

public class ReadInputsFromUser {

	public static void main(String[] args) {
		// create object of Scanner class
		Scanner sc = new Scanner(System.in);

		// print a message on console
		// System.out.println("Enter a number = ");

		// create a variable to store user entered number and make use of scanner class
		// methods
		// int number = sc.nextInt();

		// print user entered value
		// System.out.println("You have entered :: " + number);

//		// byte -> nextByte()
//		System.out.println("Enter a byte = ");
//		int byteValue = sc.nextByte();
//		System.out.println("Entered byte is " + byteValue);
//
//		// short -> nextShort()
//		System.out.println("\nEnter a short = ");
//		int shortValue = sc.nextShort();
//		System.out.println("Entered short is " + shortValue);
//
//		// int -> nextInt()
//		System.out.println("\nEnter an int = ");
//		int intValue = sc.nextInt();
//		System.out.println("Entered int is " + intValue);
//
//		// long -> nextLong()
//		System.out.println("\nEnter a long = ");
//		long longValue = sc.nextLong();
//		System.out.println("Entered long is " + longValue);
//
//		// double -> nextDouble()
//		System.out.println("\nEnter a double = ");
//		double doubleValue = sc.nextDouble();
//		System.out.println("Entered double is " + doubleValue);
//
//		// float -> nextFLoat()
//		System.out.println("\nEnter a float = ");
//		float floatValue = sc.nextFloat();
//		System.out.println("Entered float is " + floatValue);
//
//		// boolean -> nextBoolean()
//		System.out.println("\nEnter a boolean (true/false) = ");
//		boolean booleanValue = sc.nextBoolean();
//		System.out.println("Entered boolean is " + booleanValue);

		// String -> next(), nextLine()
//		System.out.print("Enter your name = ");
//		// String name = sc.next();		// delimiter is whitespace ( ) and/or newLine char (enter)
//		String name = sc.nextLine();	// delimiter is newLine char (enter)
//		System.out.println("Your name is " + name);
		
		// char -> next().charAt(0)
//		System.out.print("Enter a character = ");
//		char ch = sc.next().charAt(0);
//		System.out.println("Entered character is " + ch);

		// close the opened resources
		sc.close();
	}

}
