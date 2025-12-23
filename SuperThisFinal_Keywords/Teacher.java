package SuperThisFinal_Keywords;

public class Teacher extends College {

	Teacher() {
		super(123);
		System.out.println(" Teacher args Constr = " + 1);
	}

	void m1() {
		super.staff();
		String s = super.clgName = "JSPM";
		System.out.println("clg Name = " + s);
	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.m1();

	}

}
