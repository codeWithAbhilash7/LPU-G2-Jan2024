package com.core.methods;

public class StackAndHeapMemory {

	// all primitive data types are pass by VALUE
//	public static void changeIt(int no) {
//		System.out.println("changeIt() = " + no);		// 10
//		no = 30;
//		System.out.println("changeIt() after changing =" + no);		// 30
//	}

	/**
	 * This method prints given array on console
	 * 
	 * @param arr : Array to print on console
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// pass by reference
	// all objects, arrays are pass by reference
	public static void changeIt(int[] arr) {
		System.out.print("changeIt() = ");
		print(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		System.out.print("changeIt() after changing= ");
		print(arr);
	}

	public static void main(String[] args) {
//		Integer number = 10;
//		System.out.println("main() = " + number);		// 10
//
//		changeIt(number);
//		
//		System.out.println("main() = after changing " + number);		// 10

		int arr[] = { 1, 2, 3 };
		System.out.print("main() = ");
		print(arr);
		changeIt(arr);
		System.out.print("main() after changing= ");
		print(arr);

	}

}
