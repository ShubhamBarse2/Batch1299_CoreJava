package com.thread1;

public class Demo extends War implements Runnable {

	@Override
	public void run() {
		System.out.println("this is run method of Runnable I");

	}

	public void display() {
		System.out.println("this is diplay method of Demo class ");
	}

	public static void main(String[] args) {

		Demo d = new Demo();
		d.display();
		d.show();

		Thread t = new Thread(d);
		t.start();

	}
}
