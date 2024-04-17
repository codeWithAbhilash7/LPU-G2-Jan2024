package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	static ArrayList<Integer> numbers = new ArrayList<Integer>();

	public static void main(String[] args) {

		add();
//		System.out.println(numbers);
//		remove();
//		System.out.println(numbers);

//		System.out.println("element at index 2 = " + numbers.get(2));
//		
//		System.out.println("index of element 12 = " + numbers.indexOf((Integer)12));
//		System.out.println("last index of element 12 = " + numbers.lastIndexOf((Integer)12));

//		System.out.println(numbers);
//		numbers.set(2, 56);

		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println("Binary Search (87) = " + Collections.binarySearch(numbers, 87));
		System.out.println("max = " + Collections.max(numbers));

	}

	static void remove() {
		// numbers.clear();

		numbers.remove(2); // remove by index
		numbers.remove((Integer) 68); // remove by element
	}

	static void add() {
		numbers.add(87);
		numbers.add(68);
		numbers.add(12);
		numbers.add(78);
		// numbers.add(null);
		numbers.add(2, 55);
		numbers.add(12);
		// numbers.add(6, 55);
	}

}
