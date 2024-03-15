package com.threading;


// create a thread and check its life cycle stages using getState() method

class ThreadDemo extends Thread {

	private String name;

	public ThreadDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(name + " is running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class ThreadStates {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo thread = new ThreadDemo("Thread 1");
		System.out.println("State at Line #28 = " + thread.getState());
		thread.start();
		Thread.sleep(500);
		System.out.println("State at Line #31 = " + thread.getState());
	}

}
