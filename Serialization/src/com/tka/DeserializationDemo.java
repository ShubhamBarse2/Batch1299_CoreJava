package com.tka;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\java material\\employee.txt");
		ObjectInputStream ois = new ObjectInputStream(file);

		Employee e = (Employee) ois.readObject();

		System.out.println(e.empId + "   " + e.name + "    " + e.city);

		ois.close();
		file.close();
	}

}
