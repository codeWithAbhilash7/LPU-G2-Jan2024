package com.core.enums;

enum CoffeeSize {
	HUGE(50), OVERHELMING(80), BIG(120);

	private int ml;

	CoffeeSize(int m) {
		ml = m;
	}

	int getMl() {
		return ml;
	}
}

enum TRAFFIC_SIGNAL {
	RED, ORANGE, GREEN
}

class Coffee {
	CoffeeSize size;
}

public class Enum {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.size = CoffeeSize.BIG;

		System.out.println(c1.size);
		System.out.println(c1.size + " = " + c1.size.getMl() + " ml");

		TRAFFIC_SIGNAL signal = TRAFFIC_SIGNAL.ORANGE;
		
		switch (signal) {
		case ORANGE:
			break;

		case RED:
			break;

		case GREEN:
			break;
		}
	}

}
