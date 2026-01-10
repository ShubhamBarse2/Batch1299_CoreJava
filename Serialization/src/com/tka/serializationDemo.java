package com.tka;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serializationDemo {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(123, "suraj", "kamsheth");

		FileOutputStream file = new FileOutputStream("C:\\java material\\employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);

		oos.writeObject(e); // create // insert Operation done 

		oos.close();
		file.close();

		System.out.println("File is Created .... ! ");
		

	}

}
