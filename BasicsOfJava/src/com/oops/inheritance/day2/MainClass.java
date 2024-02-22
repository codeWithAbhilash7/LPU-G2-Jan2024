package com.oops.inheritance.day2;

public class MainClass {

	public static void main(String[] args) {

		Student[] student = new Student[3];

		student[0] = new Arts("Sachin");
		student[1] = new ScienceStudent("Veebha", "Pune", "MH");
		student[2] = new ScienceStudent("Veebha");

		System.out.println(student[0].getAddress());
		System.out.println(student[1].getAddress());

//		if(student[1].equals(student[2])) {
//			System.out.println("Equal");
//		} else {
//			System.out.println("NOT Equal");
//		}

		for (int i = 0; i < student.length; i++) {
			// System.out.println("Setting marks for " + student[i].getName());
			student[i].setEnglish((int) (Math.random() * (100 - 40 + 1) + 40));
			student[i].setHindi((int) (Math.random() * (100 - 40 + 1) + 40));

			if (student[i] instanceof ScienceStudent) {
				ScienceStudent temp = (ScienceStudent) student[i];
				temp.setChemistry((int) (Math.random() * (100 - 40 + 1) + 40));
				temp.setPhysics((int) (Math.random() * (100 - 40 + 1) + 40));
				temp.setMaths((int) (Math.random() * (100 - 40 + 1) + 40));
			} else if (student[i] instanceof Arts) {
				Arts temp = (Arts) student[i];
				temp.setHistory((int) (Math.random() * (100 - 40 + 1) + 40));
				temp.setGeography((int) (Math.random() * (100 - 40 + 1) + 40));
			}
		}

		for (Student s : student) {
			System.out.println(s);
		}

	}

}
