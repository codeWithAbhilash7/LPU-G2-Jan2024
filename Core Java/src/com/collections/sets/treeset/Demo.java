package com.collections.sets.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.collections.Student;

public class Demo {

	static Set<Student> set = new TreeSet<Student>();

	public static void main(String[] args) {
		add();
		print();
	}

	static void print() {
		System.out.println(set);
	}

	static void add() {
//		set.add("Mumbai");
//		set.add("Delhi");
//		set.add("Pune");
//		set.add("Bengaluru");
//		set.add("Chennai");
//		set.add("Agra");
//		set.add("Hydrabad");
//		set.add(null);

		
		set.add(new Student(10, "ABCD", 45));
		set.add(new Student(2, "xyz", 57));
	}

}
