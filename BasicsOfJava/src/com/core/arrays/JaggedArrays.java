package com.core.arrays;

import java.util.Arrays;

public class JaggedArrays {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		/*
		 * { {1,2,3,4}, {2,3,4,5}, {4,2,3,4,9} }
		 */

		arr[0] = new int[4];
		arr[1] = new int[12];
		arr[2] = new int[6];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++count;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
