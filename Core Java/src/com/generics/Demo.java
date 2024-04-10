package com.generics;

public class Demo {

	public static void main(String[] args) {
//		Integer[] intArr = { 54, 68, 74, 41, 32, 45, 4 };
//		Double[] doubleArr = { 54.47, 68.98, 74.35, 41.14, 32.25, 45.78, 4.99 };
//		String[] stringArr = { "ABC", "XYZ" };
//		Employee[] empArr = { new Employee(1, "ABCD", 54678), new Employee(2, "XYZ", 45679879.45) };
//
//		print(intArr);
//		print(doubleArr);
//		print(stringArr);
//		print(empArr);
		
		Printer<Integer> intPrinter = new Printer<Integer>(457);
		intPrinter.print();
		
		Printer<Employee> empPrinter = new Printer<Employee>(new Employee(1, "ABCD", 54678) );
		empPrinter.print();
	}

	public static <T> void print(T[] arr) {
		for (T i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

//	public static void print(int[] arr) {
//		for (int i : arr) {
//			System.out.print(i + ", ");
//		}
//		System.out.println();
//	}
//	
//	public static void print(double[] arr) {
//		for (double i : arr) {
//			System.out.print(i + ", ");
//		}
//		System.out.println();
//	}

}
