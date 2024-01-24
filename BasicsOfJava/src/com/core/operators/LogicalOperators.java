package com.core.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// used to perform logical AND,OR, NOT

		int number1 = 10;
		int number2 = 50;

		// AND -- if both the conditions are true, result will true
		boolean result = number1 > 15 && number2 > 45;

		// OR -- if any one condition is true, result will true
		result = number1 > 15 || number2 > 45;
		
		// NOT -- inverts the result
		result = false;
		result = !result;

		System.out.println(result);

	}

}
