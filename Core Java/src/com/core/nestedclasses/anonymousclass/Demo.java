package com.core.nestedclasses.anonymousclass;

// option 1
//class GreetImplementation implements Greet {
//	@Override
//	public void greet(String name) {
//		System.out.println("Good Morning, " + name);
//	}
//}

public class Demo {

	public static void main(String[] args) {
		// option 2 - anonymous class
		Greet morning = new Greet() {
			@Override
			public void greet(String name) {
				System.out.println("Good Morning, " + name);
			}
		};
		
		Greet evening = new Greet() {
			@Override
			public void greet(String name) {
				System.out.println("Good evening, " + name);
			}
		};

		morning.greet("Rahul");
		evening.greet("Rahul");
		
		// option 3 - lambda expression (check code in lambda package)

	}

}
