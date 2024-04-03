package com.core.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 65; // 1000001
		int number2 = 74; // 1001010

		// Bitwise AND // 1000000 --> 64
		int result = number1 & number2;

		// Bitwise OR // 1001011 --> 75
		result = number1 | number2;

		// Complement
		number1 = 35;   // 0010 0011
						// 1101 1100 1's complement
						// 1101 1100 2's complement
		result = ~number1;
		System.out.println(result);

		// shift operator
		result = number2 << 1;
	}

}
