package Abstract_Class;

public interface Payment {

	public static final double transactionFees = 3;

	public abstract void pay(double amount);

}
