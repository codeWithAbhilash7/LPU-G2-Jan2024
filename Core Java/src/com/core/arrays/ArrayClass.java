package com.core.arrays;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int arr[] = { 56, 345, 76, 5, 543, 345, 6, 4567, 23, 45687 };

//		System.out.println(Arrays.toString(arr));
		// int result = Arrays.binarySearch(arr, 0);

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
