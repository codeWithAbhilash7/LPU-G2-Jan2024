package com.generics.wildcards;

public class NumberArithmatics<T extends Number> {

	public void sum(T[] arr) {

		Double total = 0.0;

		for (T value : arr) {
			total += value.doubleValue();
		}

		System.out.println(total);
	}

}
