package com.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add("C#");
		list.add("Java");
		list.add("Python");
		list.add("JavaScript");

		System.out.println("Start = " + list);

//		for (int i = 0; i < list.size(); i++) {
//			String element = list.get(i);
//			System.out.println("removing = " + element);
//			list.remove(i);
//		}

//		for (String element : list) {
//			System.out.println("removing = " + element);
//			list.remove(element);
//			System.out.println("removed = " + element);
//		}

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String element = (String) iterator.next();
			System.out.println("removing = " + element);
			iterator.remove();
		}

		System.out.println("End = " + list);
	}

}
