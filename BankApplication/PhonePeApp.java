package BankApplication;

public class PhonePeApp {

	public static void main(String[] args) {

		System.out.println("Application is started ...!");
		System.out.println("-------------------------");
		Hdfc h = new Hdfc();
		h.viewDetails();
		h.myOffer();

		System.out.println("-------------------------");
		Sbi s = new Sbi();
		s.viewDetails();
		s.myOffer();

		System.out.println("-------------------------");
		Axis a = new Axis();
		a.viewDetails();
		a.myOffer();
	}

}
