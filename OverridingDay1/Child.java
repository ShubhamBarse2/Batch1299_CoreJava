package OverridingDay1;

public class Child extends Parent {

	@Override
	public void display(int b) {
		System.out.println("this is Child class method");
	}

	public static void main(String[] args) {

		Parent p = new Parent();
		p.display(1);
		Child c = new Child();
		c.display(3);

	}
}
