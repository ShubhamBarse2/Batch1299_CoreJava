package com.thread;

public class MyThread extends Thread {

	
	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println("myThread " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void m1() {
		for (int i = 111; i <= 200; i++) {
			System.out.println("m1 logic  " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
