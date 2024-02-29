package com.oops.interfaces;

public interface OnboardingProcess {
	double joiningBonus = 5000.00;	// public static final
	
	void collectDocuments();		// public abstract void collectDocuments();
	void getPayrollDetails();
	void enrollForInduction();
	
	default void defaultMethod() {
		System.out.println("default method in an interface");
	}
	
	void print();
}
