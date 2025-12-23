package SuperThisFinal_Keywords;

public class College {

	String clgName;

	public College() {
		System.out.println("this is costr of parent class college...");
	}

	public College(int clgId) {
		this();
		System.out.println("this is parameterised costr of parent class college... = " + clgId);
	}

	void staff() {
		System.out.println("this is parent class method of college class  ");
	}

}
