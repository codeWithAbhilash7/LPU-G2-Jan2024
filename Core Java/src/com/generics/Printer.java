package com.generics;

public class Printer<E> {
	E value;
	
	public Printer(E value) {
		this.value = value;
	}
	
	public void print() {
		System.out.println(value);
	}
}
