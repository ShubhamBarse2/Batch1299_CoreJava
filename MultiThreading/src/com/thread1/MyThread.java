package com.thread1;

public class MyThread implements A, B, Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println("runnable run method logic " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void m2() {
		System.out.println("this is an M2 method of B ");
	}

	@Override
	public void m1() {
		System.out.println("this is an M1 method of A ");

	}

}
