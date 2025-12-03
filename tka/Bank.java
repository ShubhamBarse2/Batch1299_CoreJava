package com.tka;

public class Bank {

	private int brachId;
	private String bankName;
	private String ifscCode;
	private long accNo;
	private String city;

	public int getBrachId() {
		return brachId;
	}

	public void setBrachId(int brachId) {
		this.brachId = brachId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
