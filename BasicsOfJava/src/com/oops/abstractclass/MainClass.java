package com.oops.abstractclass;

public class MainClass {

	public static void main(String[] args) {
		// Shape shape = new Shape(); // we can not create instance of an abstract class
		Shape shape = new Circle(6);	
		System.out.println(shape.calculateArea());	// dynamic method dispatch
	}

}
