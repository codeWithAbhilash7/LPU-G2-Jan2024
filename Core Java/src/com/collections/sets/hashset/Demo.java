package com.collections.sets.hashset;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	static Set<String> set = new HashSet<String>();
	

	public static void main(String[] args) {

		add();
//		print();
//		contains();
//		remove();
//		print();
		
		Set<Integer> setA = new HashSet<Integer>();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		
		Set<Integer> setB = new HashSet<Integer>();
		setB.add(3);
		setB.add(4);
		setB.add(5);
		setB.add(6);
		
		System.out.println(setA);
		System.out.println(setB);
		
//		setA.addAll(setB);		// union of 2 sets - set will contain all elements from both the sets
//		System.out.println(setA);
//		System.out.println(setB);
		
		System.out.println();
//		setA.retainAll(setB); // intersection of 2 sets - set will contain only common elements which are there in both the sets
//		System.out.println(setA);
//		System.out.println(setB);
		
		setA.removeAll(setB);		// difference of 2 sets - removes common elements
		System.out.println(setA);
		System.out.println(setB);
		
		
	}

	static void contains() {
		System.out.println("contains = " + set.contains("Pune"));
	}

	static void remove() {
		set.remove("Hydrabad");
	}

	static void print() {
		System.out.println(set);
	}

	static void add() {
		set.add("Mumbai");
		set.add("Delhi");
		set.add("Pune");
		set.add("Bengaluru");
		set.add("Chennai");
		set.add("Hydrabad");
		//set.add(null);
		
		for (String city : set) {
			System.out.println(city + " - " + city.hashCode());
		}
	}

}
