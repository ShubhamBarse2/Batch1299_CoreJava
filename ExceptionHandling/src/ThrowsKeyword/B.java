package ThrowsKeyword;

public class B {

	public void m2() {

		A a = new A();
		try {
			a.m1();
		} catch (ArithmeticException e) {
			System.out.println("divide by zero Not Allowed..!");
		}

	}
}
