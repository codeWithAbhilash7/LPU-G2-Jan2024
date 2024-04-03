package com.core.methods;

public class MethodsWithReturnType {
	
	// method which accepts parameters and no return type (void)
	public static void add(int no1, int no2) {
		int result = no1 + no2;
		System.out.println("Addition of " + no1 + " and " + no2 + " is " + result);
	}

	// method which accepts parameters and with int return type
	public static int addNumbers(int no1, int no2) {
		int result = no1 + no2;
		return result;
	}

//	public static double add(double number1, double number2) {
//		double result = number1 + number2;
//		return result;
//	}

	public static void main(String[] args) {
		int number1 = 45;
		int number2 = 12;

		int addition = addNumbers(number1, number2);
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + addition);

		addition = addNumbers(900, -12);
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + addition);

	}

}
