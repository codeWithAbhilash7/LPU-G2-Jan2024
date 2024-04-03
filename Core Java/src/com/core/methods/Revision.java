package com.core.methods;

public class Revision {

	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void printEvenOrOdd(boolean isEven) {
		if (isEven) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}

	public static void main(String[] args) {
		int number1 = 19;
		int number2 = 36;

		boolean result = isEven(number1);
		printEvenOrOdd(result);
		
		result = isEven(number2);
		printEvenOrOdd(result);
		
		result = isEven(54);
		result = isEven(544);
		result = isEven(23);
		result = isEven(65763);
		result = isEven(745672345);
		
	}

}
