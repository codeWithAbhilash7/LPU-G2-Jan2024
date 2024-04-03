package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static int add(int no1, int no2) {
		return no1 - no2;
	}

	public static void add(int no) {
		System.out.println(no++);
		if (no > 0) {
			add(no);
		} else {
			return;
		}
	}

	public static int divide(int no1, int no2) {
		try {
			return no1 / no2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	static void runtimeExceptions() {
		// System.out.println(add(20, 10));
		// add(5);

		int no1 = 0;
		int no2 = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number 1:: ");
			if (sc.hasNextInt()) {
				no1 = sc.nextInt();
			}

			System.out.print("Enter a number 2:: ");
			if (sc.hasNextInt()) {
				no2 = sc.nextInt();
			}

//			System.out.println("Result = " + (no1 / no2));
//			try {
//				System.out.println("Result = " + (no1 / no2));
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}

			divide(no1, no2);

		}

	}

	static void openFile(String filePath) throws FileNotFoundException, IOException {
		// open that file in reading mode
		File file = new File(filePath);
		if (!file.exists()) {
			throw new FileNotFoundException("File does not exist");
		}
		throw new IOException("File does not exist");
	}

	public static void main(String[] args) {

		// try with resources
		try (Scanner sc = new Scanner(System.in)) {
			openFile("file.txt");
			sc.next();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
