package com.threading.synchronization;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public synchronized void deposit(double amount) {
		balance += amount;
	}

	public synchronized boolean withdraw(double amount) {
		if (balance >= amount) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			return true;
		} else {
			System.out.println("ERROR!!! :: Insufficient funds...:(\tCurrent Balance :: " + getBalance());
		}
		return false;
	}
}
