package AbstractClassEx3;

public abstract class A {

//	abstract as well as non-abstract methods 
//	constructor 
//	variable 

	String name;

	A(String name) {
		System.out.println(name);
	}

	abstract void m1();

	public void m2() {
		System.out.println("Non abstract method of A class ");
	}

}
