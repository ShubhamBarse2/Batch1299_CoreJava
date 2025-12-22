package AbstractClass_Part2;

public class MyApp {

	public static void main(String[] args) {

		Login l;
		l = new User();
		l.myAppName();
		l.myAuthenticate("om@gmail.com", "Om@123");

		l = new Admin();
		l.myAppName();
		l.myAuthenticate("ram@gmail.com", "Ram@123");
	}

}
