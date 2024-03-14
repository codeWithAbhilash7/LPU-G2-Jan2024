package com.threads;

// way 1 - extend Thread class
//class Print extends Thread {
//	private String name;
//
//	public Print(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			try {
//				System.out.println(name + " :: #" + i);
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}

class Print implements Runnable {
	private String name;

	public Print(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(name + " :: #" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class App {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("=========== MAIN HAS STARTED ===========");

//		Print p1 = new Print("P1");
//		Print p2 = new Print("P2");
//		Print p3 = new Print("P3");
//		Print p4 = new Print("P4");
//
//		p1.start();
//		p2.start();
//		p3.start();
//		p4.start();

		Thread t1 = new Thread(new Print("P1"));
//		Thread t2 = new Thread(new Print("P2"));
//		Thread t3 = new Thread(new Print("P3"));
//		Thread t4 = new Thread(new Print("P4"));

		System.out.println("is Daemon = " + t1.isDaemon());
		t1.setDaemon(true);
		System.out.println("is Daemon = " + t1.isDaemon());
		t1.start();

		Thread.sleep(2500);

//		Runnable run = () -> {
//			for (int i = 0; i < 5; i++) {
//				try {
//					System.out.println("#" + (i + 1));
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//
//		Thread t1 = new Thread(run);
//		Thread t2 = new Thread(run);
//		Thread t3 = new Thread(run);
//		Thread t4 = new Thread(run);
//
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();

		System.out.println("=========== MAIN HAS FINISHED ===========");

	}

}
