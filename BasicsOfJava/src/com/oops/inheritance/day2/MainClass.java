package com.oops.inheritance.day2;

public class MainClass {

	public static void main(String[] args) {

		Student[] student = new Student[2];

		student[0] = new Student("Sachin");
//		student[0].setEnglish(98);
//		student[0].setHindi(88);
//
		student[1] = new ScienceStudent("Veebha");
//		student[1].setEnglish(75);
//		student[1].setHindi(80);
//		
//		ScienceStudent temp = (ScienceStudent) student[1];
//		temp.setChemistry(78);
//		temp.setPhysics(82);
//		temp.setMaths(76);

		for (int i = 0; i < student.length; i++) {
			System.out.println("Setting marks for " + student[i].getName());
			student[i].setEnglish(90);
			student[i].setHindi(90);

			if (student[i] instanceof ScienceStudent) {
				ScienceStudent temp = (ScienceStudent) student[i];
				temp.setChemistry(91);
				temp.setPhysics(92);
				temp.setMaths(93);
			}
		}

		for (Student s : student) {
			System.out.println(s);
		}

	}

}
