package ThrowsKeyword;

public class Day1 {

	public static void main(String[] args) {

//		ArithmeticException

//		try {
//
//		}catch() {
//
//		}

		System.out.println(4 / 2); // 2
		System.out.println(6 / 2); // 3
		try {
			System.out.println(4 / 0); // stop
		} catch (Exception e) {
			System.out.println("Divide by zero Not Allowed ... !");
		}
		System.out.println(8 / 2);
		System.out.println(16 / 2); // 8
	}

}
