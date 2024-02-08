package com.oops.ClassAndObjects;

public class App {

	public static void main(String[] args) {
//		Car c1 = new Car();
//
//		c1.model = "Mahindra XUV 400";
//		c1.color = "Black";
//		c1.fuelType = FUEL_TYPE.ELECTRIC;
//		c1.speed = 0;
//
//		c1.drive();
//		System.out.println("Incresing speed by " + c1.accelarate(50));
//		c1.drive();
//		System.out.println();
//		Car c2 = new Car();
//		c2.model = "Tata Nexon";
//		c2.color = "Blue";
//		c2.fuelType = FUEL_TYPE.PETROL;
//		c2.speed = 0;
//		
//		c2.drive();
//		System.out.println("Incresing speed by " + c2.accelarate(75));
//		c2.drive();

//		Car c3 = new Car("Tata Punch", "White", FUEL_TYPE.DIESEL);
//		System.out.println(c3);
//		
//		Car c4 = new Car("Honda City", "Silver");
//		System.out.println(c4);
//		if (c3.speed != 0) {
//			System.out.println("Car is moving");
//		} else {
//			System.out.println("Car is NOT moving");
//		}

//		if(c3.color.equals("Black")) {
//			System.out.println("Car is black in color");
//		} else {
//			System.out.println("Car is not black in color");
//		}

		Dog d1 = new Dog("American Bulldog", "White");
		System.out.println(d1);

//		Dog d2 = new Dog("German Hound", "Black", 4);
//		System.out.println(d2);
//		
//		Dog d3 = new Dog("Ryukyu");
//		System.out.println(d3);
		
//		d1.age = -457;
		d1.setAge(15);
		
		System.out.println(d1);

	}

}
