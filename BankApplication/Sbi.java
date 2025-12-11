package BankApplication;

public class Sbi extends Bank {

	Sbi() {
		super("SBI", 5.0);
	}

	void myOffer() {
		System.out.println("500 rs Cashback");
	}

}
