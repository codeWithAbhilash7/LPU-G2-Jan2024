package com.oops.inheritance;

public class App {

	public static void main(String[] args) {

		ScienceClass[] student = new ScienceClass[2];

		student[0] = new ScienceClass("Suresh", "Pune");
		student[0].setEnglish(78.65);
		student[0].setHindi(69.48);
		student[0].setPhysics(78.64);
		student[0].setChemistry(87.14);
		student[0].setBiology(87.69);
		student[0].setMaths(59.47);		
		System.out.println(student[0]);

	}

}
