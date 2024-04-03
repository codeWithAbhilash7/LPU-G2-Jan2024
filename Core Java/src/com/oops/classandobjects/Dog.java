package com.oops.classandobjects;

public class Dog {
	// data members / instance variables / properties of the class
	private String breed;
	private int age;
	private String color;

//	Dog() {
//		this.breed = "";
//		this.color = "";
//		this.age = 0;
//	}

	Dog(String breed) {
		// constructor chaining
		this(breed, "", 0);
	}

	Dog(String breed, String color, int age) {
		this(breed, color);
		this.age = age;
	}

	Dog(String breed, String color) {
		// constructor chaining
		this.breed = breed;
		this.color = color;
		this.age = 0;
	}

	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}

	// getter / accessor
	public int getAge() {
		return this.age;
	}

	// setter / mutator
	public void setAge(int age) {
		if (age < 0 || age > 15) {
			System.err.println("Error :: Invalid argument!!!");
			return;
		}
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
