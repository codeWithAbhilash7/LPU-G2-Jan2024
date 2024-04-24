package com.collections.sets.linkedhasset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {

	static Set<String> set = new LinkedHashSet<String>();
	
	public static void main(String[] args) {
		add();
		print();
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
		set.add(null);

	}

}
