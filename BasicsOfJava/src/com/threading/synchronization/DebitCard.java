package com.threading.synchronization;

public class DebitCard extends Thread {
	private BankAccount account;
	private double amount;

	public DebitCard(String name, BankAccount account, double amount) {
		super(name);
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		if (account.withdraw(amount)) {
			String threadName = Thread.currentThread().getName();
			Long id = Thread.currentThread().getId();
			System.out.println(
					threadName + " ( " + id + " ) withdrew Rs. " + amount + "\tBalance :: " + account.getBalance());
		}
		super.run();
	}

}
