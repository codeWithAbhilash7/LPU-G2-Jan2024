package com.core;

public class Methods {

	// public --> access specifier
	// void --> returns nothing
	// greetHello --> name of the method
	// () --> accepts no parameters
//	public static void greetHello() {
//		System.out.println("Hello!");
//	}
//
//	public static void wish() {
//		System.out.println("Have a wonderful day!!!");
//	}
//	
//
//	public static void greetMorning() {
//		greetHello();
//		System.out.println("Good Morning!");
//		wish();
//	}
//
//	public static void greetAfternoon() {
//		greetHello();
//		System.out.println("Good Evening!");
//		wish();
//	}

//	/**
//	 * parameters
//	 * @param number1	
//	 * @param number2
//	 */
//	public static void addNumbers(int number1, int number2) {
//		int result = number1 + number2;
//		System.out.println("Addition of " + number1 + " and " + number2 + " is " + result);
//	}

	public static int addNumbers(int number1, int number2) {
		int result = number1 + number2;
		return result;
	}

//	public static double add(double number1, double number2) {
//		double result = number1 + number2;
//		return result;
//	}

	public static void main(String[] args) {
//		greetMorning();
//		greetMorning();
//		greetMorning();
//		greetAfternoon();
//		greetAfternoon();

//		greetHello();
		int number1 = 45;
		int number2 = 12;
		int addition = addNumbers(number1, number2);
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + addition);

		addition = addNumbers(900, -12);
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + addition);

	}

}
