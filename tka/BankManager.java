package com.tka;

public class BankManager {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAccNo(123456789876543l);
		b.setBankName("SBI");
		b.setBrachId(2);
		b.setCity("goa");
		b.setIfscCode("sbin012345676543");
		System.out.println("Bank Details ");
		System.err.println("Account NO = " + b.getAccNo());
		System.err.println("Bank Name = " + b.getBankName());
		System.err.println("Branch ID = " + b.getBrachId());
		System.err.println("Bank city = " + b.getCity());
		System.err.println("Bank IFSC CODE = " + b.getIfscCode());

	}

}
