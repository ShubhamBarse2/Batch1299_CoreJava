package OverridingDay1;

public class Gpay extends Bank {

	
	
	@Override
	public void payment() {
		System.out.println("get CashBack 100 rs...");
	}

	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.payment();
	}

}
