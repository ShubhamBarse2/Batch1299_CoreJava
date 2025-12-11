package BankApplication;

public class Bank {

	String bankName;
	double roi;

	public Bank(String bankName, double roi) {
		this.bankName = bankName;
		this.roi = roi;
	}
	
	void viewDetails() {
	 System.out.println("Bank Name = "+bankName);
	 System.out.println("Bank ROI = "+roi);
	}

}
