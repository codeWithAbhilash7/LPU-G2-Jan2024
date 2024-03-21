package com.exceptions;

class Parent {

}

class Demo1 extends Parent {

}

class Demo2 extends Parent {

}

public class TryCatch {

	public static int arithmatic(int no1, int no2) {
		int result = 0;
		try {
			result = no1 / no2;
		} catch (Exception e) {
			System.out.println("catch of arithmatic(int, int)");
			// e.printStackTrace();
		}
		return result;
	}

	public static void arithmatic() {
		int no1 = 10;
		int no2 = 0;

		int result = 0;
//		try {
		for (int i = 0; i < 5; i++) {
			result = arithmatic(no1, no2);
		}
//		} catch (Exception e) {
//			System.out.println("catch of arithmatic()");
//		}

		System.out.println("Division is = " + result);
	}

	public static void nestedBlock(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			try {
				result += arr[i] / arr[i + 1];
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
				System.err.println("error :: cannot divide by zero");
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.err.println("error :: you are trying to access invalid index...");
			} catch (RuntimeException re) {
				re.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Result = " + result);
	}

	public static void indexOutOfBounds(int[] arr) {

		try {
			System.out.println(arr[4]);
		} catch (Exception e) {
			System.err.println("4 is not a valid index...");
		}
	}

	public static void main(String[] args) {
//		try {
//		arithmatic();
//			System.out.println("Different methods...");
//		} catch (Exception e) {
//			System.out.println("catch of main()");
//		}

//		int[] arr = { 1, 2, 3, 0 };
////		indexOutOfBounds(arr);
//		nestedBlock(arr);
//
////		int[] arr2 = { 1, 2, 3, 4 };
////		nestedBlock(arr2);

//		String str = "asdf";
//		System.out.println("Length = " + str.length());
//
//		Integer i = Integer.parseInt(str);

//		Parent d1 = new Demo1();
//		Demo2 d2 = (Demo2) d1;

//		Scanner sc = new Scanner(System.in);
//		sc.nextInt();

		System.out.println("\nDone!!!");
	}

}
