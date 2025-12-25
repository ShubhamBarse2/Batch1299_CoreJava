package PojoClass;

public class MainClass {

	public static void main(String[] args) {

		College c = new College(1, "JSPM");
		Student s = new Student(123, "om", "pune", c);

		System.out.println(s);
	}

}
