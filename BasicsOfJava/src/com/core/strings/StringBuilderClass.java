package com.core.strings;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sf = new StringBuilder("Hello!");
		sf.append(" How are you?");

		System.out.println(sf);
		System.out.println("Length = " + sf.length());
		System.out.println("Capacity = " + sf.capacity());
		System.out.println("Char at 4 = " + sf.charAt(4));

	}

}
