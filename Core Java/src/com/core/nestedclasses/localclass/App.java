package com.core.nestedclasses.localclass;

public class App {
	private String name = "Sachin";

	private void print() {
		
		class LocalInnerClass {
			private String greet;;

			LocalInnerClass(String msg) {
				greet = msg;
			}
			
			void printMsg() {
				System.out.println(greet + ", " + name);
			}
		}
		
//		LocalInnerClass local = new LocalInnerClass("Hello");
//		local.printMsg();
		
		new LocalInnerClass("Hello").printMsg();		// anonymous objects
	}

	public static void main(String[] args) {
		App a = new App();
		a.print();
	}
}
