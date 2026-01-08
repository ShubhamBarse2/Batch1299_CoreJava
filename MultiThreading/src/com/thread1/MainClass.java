package com.thread1;

public class MainClass {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.m1();
		mt.m2();

		Thread t = new Thread(mt);
		t.start();

	}

}
