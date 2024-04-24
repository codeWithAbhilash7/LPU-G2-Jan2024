package com.collections.wildcards;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubleList = Arrays.asList(1.2, 3.4, 5.6, 7.8);
		List<String> stringList = Arrays.asList("C", "C++", "Java");
		List<Number> numberList = Arrays.asList(1.2, 3.4, 5.6, 7.8);

//		print(intList);
//		print(doubleList);
//		print(stringList);

//		sum(intList);
//		sum(doubleList);
		// sum(stringList);
		
		printInt(intList);
		printInt(numberList);
//		printInt(doubleList);
//		printInt(stringList);
	}

	// lower-bounded
	public static void printInt(List<? super Integer> list) {
		System.out.println(list);
	}

	// upper-bounded
	public static void sum(List<? extends Number> list) {
		double sum = 0;

		for (Number number : list) {
			sum += number.doubleValue();
		}

		System.out.println("Sum = " + sum);
	}

	// unbounded
	public static void print(List<?> list) {
		System.out.println(list);
	}

}
