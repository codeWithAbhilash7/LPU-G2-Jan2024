package com.core.arrays;

public class OneDimensionalArrays {

	public static void main(String[] args) {
		int arr[] = new int[10];

//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// arr[0] = 658;

		// System.out.println(arr[0]);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ++count;
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		for (int ar : arr) {
			System.out.print(ar + " ");
		}

		// Write a Java program to sum values of an array.
		// Write a Java program to calculate the average value of array elements.
		// Write a Java program to find the index of an array element.
		// Write a Java program to find the maximum and minimum value of an array.
	}

}
