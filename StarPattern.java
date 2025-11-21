package com.jbk;

public class StarPattern {
	
	
	
	
	

	/*
	 *
	 **
	 ***
	 ****
	 *****
	 * 
	 * 
	 * 
	 * 
	 * &&&&&
	 * &&&& 
	 * &&& 
	 * && 
	 * &
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) { // 1 to 5 rows
			for (int j = 1; j <= i; j++) { // 1 to 5 column

				System.out.print("&");

			}
			System.out.println(" ");
		}
	}

}
