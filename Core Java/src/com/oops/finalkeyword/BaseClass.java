package com.oops.finalkeyword;

public class BaseClass {

	/*
	 * final data members can be initialized 
	 * 1. at the time declaration 
	 * 2. initializer block 
	 * 3. constructor
	 */
	private final double id;

	{
		// id = 457.565;
	}

	public BaseClass() {
		id = 457.565;
	}

	public void SetId(double id) {
		// this.id = id;
	}
	
	/*
	 * final methods can not be overridden 
	 */
	public final void doSomething() {
		System.out.println("Working...");
	}

}
