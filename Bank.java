package com.oop;

public class Bank {

	int brachId;
	String bankName;
	String ifscCode;
	long accNo;
	String city;

	public void bankDetails(int brachI, String bankName, String ifscCode, long accNo, String city) {

		this.brachId = brachI;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.accNo = accNo;
		this.city = city;

		System.err.println("Bank Details ... !");
		System.out.println("Brach ID " + brachId);
		System.out.println("Brach Name " + bankName);
		System.out.println("Brach IFSC CODE  " + ifscCode);
		System.out.println("Brach ACC NO " + accNo);
		System.out.println("Brach city " + city);
	}

}
