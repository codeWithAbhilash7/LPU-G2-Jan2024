package com.core.strings;

public class StringClass {

	public static void main(String[] args) {
		// stringPool();
		stringMethods();
	}

	private static void stringMethods() {
		String str = "Object Oriented Programming using Java!!!";

		System.out.println("Length = " + str.length());
		System.out.println("Char at 4 = " + str.charAt(4));
		System.out.println("compareTo = " + str.compareTo("Object Oriented Programming using Java!!!"));
		System.out.println("Concat = " + str.concat(" It's easy.. LOL!!!"));
		System.out.println("Contains = " + str.contains("Java"));
	}

	private static void stringPool() {
		// string literal
		String s1 = "Hello";
		String s2 = "Hello";

		// new keyword
		String s3 = new String("Hello");
		String s4 = new String("Hello");

		s1 = "Good morning";
		s2 = "Hi";

		s1 += ". How are you?";

		if (s1 == s2) {
			System.out.println("s1 and s2 are same");
		} else {
			System.out.println("s1 and s2 are not same");
		}

		if (s1 == s3) {
			System.out.println("s1 and s3 are same");
		} else {
			System.out.println("s1 and s3 are not same");
		}

		if (s3 == s4) {
			System.out.println("s3 and s4 are same");
		} else {
			System.out.println("s3 and s4 are not same");
		}

		if (s3.equals(s4)) {
			System.out.println("s4 and s3 are same");
		} else {
			System.out.println("s4 and s3 are not same");
		}
	}

}
