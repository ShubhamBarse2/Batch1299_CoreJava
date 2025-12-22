package AbstractClass_Part2;

public class User extends Login {

	@Override
	void myAuthenticate(String username, String password) {

		if (username == "om@gmail.com" && password == "Om@123") {
			System.out.println("User Login Successfully ");
		} else {
			System.out.println("	Invalid Credentials ... ! ");
		}

	}

}
