package Multiple_Inheritance;

public class Child implements Father, Mother {

	@Override
	public void surName() {
		System.out.println("my surname is PATIL");
	}

	@Override
	public void coocking() {
		System.out.println("KHICHDI...");

	}

	public static void main(String[] args) {
		Child c = new Child();
		c.surName();
		c.coocking();
	}

}
