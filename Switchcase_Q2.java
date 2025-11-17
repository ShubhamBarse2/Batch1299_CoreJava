package com.jbk;

public class Switchcase_Q2 {

//	Calculator  :  + - * % / 
	public static void main(String[] args) {

		char operation = '/';

		switch (operation) {

		case '+':
			int a = 3, b = 4;
			System.out.println("Addition of " + a + " + " + b + "  is = " + (3 + 4));
			break;

		case '-':
			int c = 3, d = 4;
			System.out.println("SUB of a - b is =  " + (3 - 4));
			break;
		case '*':
			int e = 3, f = 4;
			System.out.println("MUL of a * b is =  " + (3 * 4));
			break;
		case '/':
			int g = 6, h = 3;
			System.out.println("DIV of a / b is =  " + (g / h));
			break;
		case '%':
			int i = 3, j = 4;
			System.out.println("MOD of a % b is =  " + (3 % 4));
			break;
		default:

			System.out.println("Invalid Operation...!");

		}
	}

}
