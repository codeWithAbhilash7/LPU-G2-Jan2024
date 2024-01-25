package com.core.conditionalflow;

public class DecisionMakingUsingIf {

	public static void main(String[] args) {

//		int age = 21;
//
//		if (age >= 18) {
//			System.out.println("You are eligible to drive!!!");
//		} else {
//			System.out.println("You are NOT eligible to drive!!!");
//		}

//		int marks = 70;
//
//		if (marks >= 70) {
//			System.out.println("A+ Grade");
//		} else if (marks >= 60) {
//			System.out.println("A Grade");
//		} else if (marks >= 50) {
//			System.out.println("B Grade");
//		} else if (marks >= 40) {
//			System.out.println("C Grade");
//		} else {
//			System.out.println("Fail");
//		}

//		int age = 22;
//		char gender = 'm';
//
//		if (gender == 'f') {
//			if (age >= 18) {
//				System.out.println("Eligible");
//			} else {
//				System.out.println("Not Eligible");
//			}
//		} else if (gender == 'm') {
//			if (age >= 21) {
//				System.out.println("Eligible");
//			} else {
//				System.out.println("Not Eligible");
//			}
//		}
		
		// ternary operator
		int number1 = 30;
		int number2 = 50;
//		int diff = 0;
//		if(number1 > number2) {
//			diff = number1 - number2;
//		} else {
//			diff = number2 - number1;
//		}
		
		int diff = number1 > number2 ? number1 - number2 : number2 - number1;
		
		System.out.println(diff);
		
		// Input 2 numbers and print the maximum among them.
		// Input 3 numbers and print the maximum among them.
		// Input a number and print whether the number is even or odd.
		// Any year is input by the user. Write a program to determine whether the ear is a leap year or not.
		// Input 2 numbers and print the maximum among them. (Use ternary operator)
		

	}

}
