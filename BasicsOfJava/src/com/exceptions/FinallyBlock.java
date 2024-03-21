package com.exceptions;

import java.util.Scanner;

public class FinallyBlock {

	private static void demo() {
		Scanner sc = new Scanner(System.in);
		try {
			// statement 1
			System.out.println("Try #1 block");
			int no = 10 / 0;
			System.out.println("Try #2 block");
			// statement 2
			// statement 3
//		} catch (Exception e) {
//			System.out.println("Catch block");
		} finally {
			System.out.println("Finally block");
			sc.close();
		}
	}

	public static void main(String[] args) {

		try {
			demo();
		} catch (Exception e) {
			System.out.println("Catch block of main()");
		}

	}

}
