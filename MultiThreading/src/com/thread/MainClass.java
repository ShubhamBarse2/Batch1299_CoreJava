package com.thread;

public class MainClass {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start(); // it calls run method
		t.m1();

	}

}
