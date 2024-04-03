package com.core.conditionalflow;

public class DecisionMakingUsingSwitch {

	public static void main(String[] args) {

		char grade = 'C';

		// byte, short, int, char, String and enum
		switch (grade) {
		case 'A':
			System.out.println("You have got grade A");
			break;

		case 'B':
			System.out.println("You have got grade B");

			break;

		case 'C':
			System.out.println("You have got grade C");
			break;

		default:
			System.out.println("Invalid grade");

		}

		// Write a program to read a weekday number and print weekday

		if (grade == 'A') {
			System.out.println("A Grade");
		} else if (grade == 'B') {
			System.out.println("B Grade");
		} else if (grade == 'C') {
			System.out.println("C Grade");
		} else {
			System.out.println("Invalid grade");
		}
	}

}
