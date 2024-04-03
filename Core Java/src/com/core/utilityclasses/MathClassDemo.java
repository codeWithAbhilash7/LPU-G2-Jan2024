package com.core.utilityclasses;

public class MathClassDemo {

	public static void main(String[] args) {
		System.out.println("PI = " + Math.PI);
		System.out.println("abs(-25.65) = " + Math.abs(-25.65));
		System.out.println("ceil(25.65) = " + Math.ceil(25.65));
		System.out.println("floor(25.65) = " + Math.floor(25.65));

		System.out.println("round(25.68) = " + Math.round(25.68));
		System.out.println("round(25.38) = " + Math.round(25.38));

		System.out.println("max(57, 47) = " + Math.max(57, 47));
		System.out.println("min(57, 47) = " + Math.min(57, 47));

		System.out.println("pow(5, 3) = " + Math.pow(5, 3));

		int min = 1;
		int max = 6;
		double random = Math.random() * (max - min + 1) + min;
		System.out.println("Random = " + random);

	}

}
