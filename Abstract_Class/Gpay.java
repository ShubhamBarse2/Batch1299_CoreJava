package Abstract_Class;

public class Gpay implements Payment {

	@Override
	public void pay(double amount) {
		double total = amount + transactionFees;
		System.out.println(total + "  Gpay");
	}
}
