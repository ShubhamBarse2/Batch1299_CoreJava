package StaticCode;

public class Outer {

	static void m1() {
		System.out.println("this is Outer class method m1");
	}

	public static class Inner {
		void m2() {
			System.out.println("Inner class m2 methd");
		}
	}

	public static void main(String[] args) {
		Inner i = new Inner();
		i.m2();
	}

}
