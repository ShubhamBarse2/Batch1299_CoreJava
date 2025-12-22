package AbstractClass_Part2;

public abstract class Login {

	abstract void myAuthenticate(String userName, String password);

	void myAppName() { // non-abstract method
		System.out.println("My Application Swiggy ...!");
	}

}
