package Abstract_Class;

public class Main {

	public static void main(String[] args) {
		Payment p;
		p = new Gpay();
		p.pay(299);
		p = new PhonePe();
		p.pay(298);
	}

}
