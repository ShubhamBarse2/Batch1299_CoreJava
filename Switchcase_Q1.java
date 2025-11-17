package com.jbk;

public class Switchcase_Q1 {

	public static void main(String[] args) {

		String color = "green";

		switch (color) {

		case "Red":
			System.out.println("STOP...!");
			break;
		case "Yellow":
			System.out.println("Get Ready ...!");
			break;
		case "Green":
			System.out.println("Go ...! ");
			break;
		default:
			System.out.println("Invalid Signal...! ");
		}

	}

}
