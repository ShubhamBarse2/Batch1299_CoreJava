package com.jbk;

public class BreakContinue {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 10; i++) {
//			int product = 9 * i;
//			if (product > 50) {
//				break;
//			}
//			System.out.println(product);
//
//		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				continue;
			}

			System.out.println(ch);

		}

	}

}
