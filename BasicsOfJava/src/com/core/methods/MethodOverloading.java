package com.core.methods;

public class MethodOverloading {

	// methods having same name
	// signature --> number of arguments or different data type or there sequence must be different 
	// return type is not considered
	// both/all the method must be written in the same class
	
	// name mangling --> name of the method, data type of parameters/arguments

	public static void add(int number1, int number2) {
		int result = number1 + number2;
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + result);
	}

	public static int add(int number1, int number2, int number3) {
		int result = number1 + number2 + number3;
		System.out.println("Addition of " + number1 + ", " + number2 + " and " + number3 + " is " + result);
		return result;
	}

	public static void add(double number1, double number2) {
		double result = number1 + number2;
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + result);
	}

	public static void add(boolean bValue, char cValue) {
		System.out.println("Method with boolean and char");
	}
	
	public static void add(char cValue, boolean bValue) {
		System.out.println("Method with char and boolean");
	}

	public static void main(String[] args) {
		add(10, 20);
		add(10, 20, 30);
		add(54.65, 458.45);
	}

}
