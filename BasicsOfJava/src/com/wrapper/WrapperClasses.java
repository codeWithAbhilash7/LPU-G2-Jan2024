package com.wrapper;

public class WrapperClasses {

	public static void main(String[] args) {
		// byte --> Byte
		// short --> Short
		// int --> Integer
		// long --> Long
		// double --> Double
		// float --> Float
		// boolean --> Boolean
		// char --> Character

		int iPrimitive = 10;

		// boxing --> converting primitive data type into wrapper class objects
		Integer iWrapper = new Integer(iPrimitive);

		// unboxing --> converting wrapper class objects into primitive data type
		iPrimitive = iWrapper.intValue();

		// System.out.println("Interger Wrapper --> " + iWrapper.intValue());

	}

}
