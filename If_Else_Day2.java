package com.jbk;

public class If_Else_Day2 {

	public static void main(String[] args) {

		int year = 1900;

		if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
			System.out.println("This is an LEAP YR...! ");
		} else {
			System.out.println("This is NOT LEAP YR...! ");
		}

	}

}
