package OverloadingDay1;

public class LoginAPI {

//	1> different DataTypes 
//	2> Number of Parameters
//	3> 

	int getOtp() {
		return 13434;
	}

	int getOtp(long mobNo) {
		return 12345;
	}

	String getOtp(String email) {
		return "Ae234&f";
	}

	String getOtp(long mobNo, String email) {
		return "A%%%W3";
	}

	public static void main(String[] args) {
		LoginAPI l = new LoginAPI();
		System.out.println(l.getOtp());
		System.out.println(l.getOtp(234567834l));
		System.out.println(l.getOtp("ram@gmail.com"));
		System.out.println(l.getOtp(234567834l, "ram@gmail.com"));

	}

}
