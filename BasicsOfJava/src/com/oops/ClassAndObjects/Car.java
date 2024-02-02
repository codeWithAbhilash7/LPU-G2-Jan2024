package com.oops.ClassAndObjects;

enum FUEL_TYPE {
	NOT_DEFINED, PETROL, DIESEL, CNG, ELECTRIC
}

public class Car {
	// data member (properties of an entity)

	// model number
	String model;

	// color
	String color;

	// fuel type
	FUEL_TYPE fuelType;

	// speed of the car
	int speed;

	// default (parameterless) constructor
	Car() {
		this.model = "";
		this.color = "";
		this.fuelType = FUEL_TYPE.NOT_DEFINED;
		this.speed = 0;
	}

	// this --> data current object

	// parameterized constructor
	Car(String model, String color, FUEL_TYPE fuel) {
		this.speed = 0;
		this.model = model;
		this.color = color;
		this.fuelType = fuel;
	}

	Car(String _model, String _color) {
		this.speed = 0;
		this.model = _model;
		this.color = _color;
		this.fuelType = FUEL_TYPE.NOT_DEFINED;
	}

	// Member functions (Behaviors)
	void drive() {
		System.out.println(
				"Model = " + model + "\tColor = " + color + "\tFuel Type = " + fuelType + "\tSpeed = " + speed);
	}

	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", fuelType=" + fuelType + ", speed=" + speed + "]";
	}

	int accelarate(int incrementValue) {
		for (int i = 0; i < incrementValue; i++) {
			speed++;
		}
		return speed;
	}
}
