package com.core.varagrs;

public class VariableArguments {

//	private static int add(int no1, int no2) {
//		return no1 + no2;
//	}
//
//	private static int add(int no1, int no2, int no3) {
//		return no1 + no2 + no3;
//		// return add(no1, add(no2, no3));
//	}

	// varargs --> variable arguments
	private static int add(boolean bVal, int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(true));
		System.out.println(add(true, 10, 20));
		System.out.println(add(true, 10, 20, 30));
		System.out.println(add(true, 46, 87, 9, 46, 47, 7, 64, 64, 87, 564));

	}

}
