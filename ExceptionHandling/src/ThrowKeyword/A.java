package ThrowKeyword;

public class A {

	public void m1() {

		int a = 4;
		int b = 0;

		if (b == 0) {
			throw new RahulException("this is my Own Exception : sorry this is NOT Allowed..!");
		}

		int result = a / b;
		System.out.println(result);
	}

}
