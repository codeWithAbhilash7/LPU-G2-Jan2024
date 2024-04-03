package com.core.lambda;

import com.core.nestedclasses.anonymousclass.Greet;

@FunctionalInterface
interface SaySomething {
	void say();
}

@FunctionalInterface
interface Addition {
	int add(int no1, int no2);
}

public class App {

	public static void main(String[] args) {

		// anonymous classes
//		Greet morning = new Greet() {
//			@Override
//			public void greet(String name) {
//				System.out.println("Good morning, " + name);
//			}
//		};

		SaySomething s = () -> {
			System.out.println("I don't have anything to say...");
			System.out.println("I'm done");
		};
		s.say();

//		Addition a = (no1, no2) -> {
//			return no1 + no2;
//		};

		Addition a = (no1, no2) -> no1 + no2;

		System.out.println(a.add(10, 20));

		Greet morning = name -> System.out.println("Good morning, " + name);
		morning.greet("Rakesh");

	}

}
