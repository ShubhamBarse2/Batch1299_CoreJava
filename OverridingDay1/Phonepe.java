package OverridingDay1;

public class Phonepe extends Bank {

	@Override
	public void payment() {
		System.out.println("get CashBack 10 rs...");
		super.a = 23; // this is global Variable
		super.payment(); // 
	}

	public static void main(String[] args) {
		Phonepe p = new Phonepe();
		p.payment();
	}

}
