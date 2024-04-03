package com.oops.packages;

import com.oops.classandobjects.*; // import all public classes from the package
import com.oops.classandobjects.Car.FUEL_TYPE; // import specific class from the package

public class App {

	public static void main(String[] args) {
		Car c1 = new Car("Hyundai Verna", "Black", FUEL_TYPE.PETROL);
		System.out.println(c1);

		// built-in packages -- provided with JDK
		// java.lang
		// java.util

		// user defined --> created by developer/you

	}

}
