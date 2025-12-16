package OverloadingDay1;

public class StudentPortal {

	StudentPortal(float sscMarks, float diplomaMarks, float finalMarks) {
		System.out.println("DSY Student...!");
	}

	StudentPortal(float sscMarks, float hscMarks, float finalMarks, float firstSemMarks) {
		System.out.println("Regular Students ...!");
	}

}
