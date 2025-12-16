package OverloadingDay1;

public class Calculator {

	
	
	// same method name with same class name but defferent parameters
	
	void myAddiction(int a, int b) {
		System.out.println(a + b);
	}

	void myAddiction(float a, float b) {
		System.out.println(a + b);
	}

	void myAddiction(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.myAddiction(2, 3);
		c.myAddiction(2.4f, 3.5f);
		c.myAddiction(2234.45, 323456.6);
	}

}
