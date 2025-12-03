package com.oop;

public class BankApp {

	public static void main(String[] args) {

		Bank b = new Bank();
		b.bankDetails(121, "SBI", null, 23456787654334l, "goa");
		System.out.println("   ");
		b.bankDetails(131, "AXIS", "axis123456765", 23356787654334l, "nsk");
		System.out.println("   ");
		b.bankDetails(141, "HDFC", "hdfc23487433487", 23456785654334l, "pune");

	}

}
