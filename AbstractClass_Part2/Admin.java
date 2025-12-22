package AbstractClass_Part2;

public class Admin extends Login {

	@Override
	void myAuthenticate(String username, String password) {

		if (username == "ram@gmail.com" && password == "Ram@123") {
			System.out.println("Admin Login Successfully ");
		} else {
			System.out.println("Invalid Credentials ... ! ");
		}

	}
}
