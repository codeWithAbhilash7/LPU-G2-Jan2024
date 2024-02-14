package com.oops.accessmodifiers.pkg1;

public class Student {
	private int privateData = 10;
	int defaultData = 20;
	protected int protectedData = 30;
	public int publicData = 40;

	private void privateMethod() {
		System.out.println("Student class private method");
	}
	
	void defaultMethod() {
		System.out.println("Student class default method");
	}
	
	protected void protectedMethod() {
		System.out.println("Student class protected method");
	}
	
	public void publicMethod() {
		System.out.println("Student class public method");
	}
	
	void testMethod() {
		System.out.println(privateData);
		System.out.println(defaultData);
		System.out.println(protectedData);
		System.out.println(publicData);
		
		privateMethod();
		defaultMethod();
		protectedMethod();
		publicMethod();		
	}

}
