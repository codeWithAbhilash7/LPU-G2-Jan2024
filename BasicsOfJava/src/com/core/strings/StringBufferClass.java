package com.core.strings;

public class StringBufferClass {

	public static void main(String[] args) {
		// StringBuffer
		StringBuffer sf = new StringBuffer("Hello!");
		sf.append(" How are you?");
		
		System.out.println(sf);
		System.out.println("Length = " + sf.length());
		System.out.println("Capacity = " + sf.capacity());
		System.out.println("Char at 4 = " + sf.charAt(4));
		
		
		// StringBuilder
		
		

	}

}
