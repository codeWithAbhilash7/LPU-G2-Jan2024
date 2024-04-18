package com.collections.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	static List<Integer> numbers = new LinkedList<>();

	public static void main(String[] args) {
		add();
		System.out.println(numbers);
//		remove();
//		System.out.println(numbers);

//		System.out.println("element at index 2 = " + numbers.get(2));
//		
//		System.out.println("index of element 12 = " + numbers.indexOf((Integer)12));
//		System.out.println("last index of element 12 = " + numbers.lastIndexOf((Integer)12));

//		System.out.println(numbers);
//		numbers.set(2, 15);
//		System.out.println(numbers);

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
		//numbers.add(null);
		numbers.add(2, 55);
		numbers.add(12);
		numbers.add(6, 55);
	}
}
