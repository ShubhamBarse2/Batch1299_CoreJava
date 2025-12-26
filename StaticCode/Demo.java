package StaticCode;

public class Demo {

	int id;
	String name;
	static String instituteName = "TKA";

	Demo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static {
		System.out.println("this is static block");
	}
	{
		System.out.println("this is NON static block");
	}

	void display() {
		System.out.println(" id = " + id);
		System.out.println(" name =  " + name);
		System.out.println(" instituteName = " + instituteName);
	}

}
