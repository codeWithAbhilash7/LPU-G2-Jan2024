package com.threading.synchronization;

public class MainClass {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(50000);

		DebitCard d1 = new DebitCard("Card 1", account, 20000);
		DebitCard d2 = new DebitCard("Card 2", account, 10000);
		DebitCard d3 = new DebitCard("Card 3", account, 15000);
		DebitCard d4 = new DebitCard("Card 4", account, 30000);
		DebitCard d5 = new DebitCard("Card 5", account, 9000);
		DebitCard d6 = new DebitCard("Card 6", account, 2100);
		DebitCard d7 = new DebitCard("Card 7", account, 2200);

		d1.start();
		d2.start();
		d3.start();
		d4.start();
		d5.start();
		d6.start();
		d7.start();

	}

}
