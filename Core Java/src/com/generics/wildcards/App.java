package com.generics.wildcards;

import com.generics.Employee;

public class App {

	public static void main(String[] args) {
		Integer[] intArr = { 54, 68, 74, 41, 32, 45, 4 };
		Double[] doubleArr = { 54.47, 68.98, 74.35, 41.14, 32.25, 45.78, 4.99 };
//		Employee[] empArr = { new Employee(1, "ABCD", 54678), new Employee(2, "XYZ", 45679879.45) };
//
//		NumberArithmatics<Double> doubleValue = new NumberArithmatics<Double>();
//		NumberArithmatics<Integer> intValue = new NumberArithmatics<Integer>();
//
//		intValue.sum(intArr);
//		doubleValue.sum(doubleArr);
		
		ObjectIO<Employee> empIO = new ObjectIO<Employee>();
		empIO.exportToFile(new Employee(1, "ABCD", 54678));
	}
	
	public static <T extends Number> void sum(T[] arr) {
		Double total = 0.0;
		
		for (T i : arr) {
			// total += i;
		}
		System.out.println(total);
	}

}
