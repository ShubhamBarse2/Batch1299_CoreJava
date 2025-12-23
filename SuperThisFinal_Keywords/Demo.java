package SuperThisFinal_Keywords;

public class Demo {

	final double salary = 500000.56;

	public void m1(final int b) {

//		b = 23;
		System.out.println(b);

		System.out.println("m1 method of Demo class");
		double tSalary = salary + 4500;
		System.out.println(tSalary);
	}

	public final void pInfo() {
		System.out.println("acc No - 2345678765432");
	}

}
