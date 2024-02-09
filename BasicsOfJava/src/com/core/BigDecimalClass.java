package com.core;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalClass {

	public static void main(String[] args) {
		MathContext context = new MathContext(4);
		BigDecimal no1 = new BigDecimal("3.14");
		BigDecimal no2 = new BigDecimal("2.36");

		System.out.println("Add = " + no1.add(no2));
		System.out.println("Diff = " + no1.subtract(no2));
		System.out.println("Multiply = " + no1.multiply(no2));
		System.out.println("Divide = " + no1.divide(no2, 5, RoundingMode.HALF_UP));
		System.out.println(no1.pow(2));

	}

}
