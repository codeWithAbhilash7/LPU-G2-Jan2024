package com.core.operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		int number1 = 28;
		int number2 = 5;

		// arithmetic operators

		int sum = number1 + number2;
		int diff = number1 - number2;
		int product = number1 * number2;
		double division = (double) number1 / number2;
		int modulus = number1 % number2;

		System.out.println("Addition is " + sum);
		System.out.println("Difference is " + diff);
		System.out.println("Product is " + product);
		System.out.println("Division is " + division); // 5.6
		System.out.println("Modulus is " + modulus);

		// increment
		number2 = 10;
		int result = number2++; // post increment int result = number2; number2 = number2 + 1;
		System.out.println("After post increment :: result = " + result);

		number2 = 10;
		result = ++number2; // pre increment number = number + 1;
		System.out.println("After pre increment :: result = " + result);

		// decrement
		result = number2--; // post decrement int result = number2; number2 = number2 - 1;
		result = --number2; // pre decrement number = number - 1;

		// short hand operators
		number2 += 50;		// number2 = number2 + 50;
		number2 -= 50;		// number2 = number2 - 50;
		number2 *= 50;		// number2 = number2 * 50;
		number2 /= 50;		// number2 = number2 / 50;
		number2 %= 50;		// number2 = number2 % 50;

	}

}
