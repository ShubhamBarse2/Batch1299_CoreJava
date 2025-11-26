package com.main;

import com.oop.Employee;

public class MainClass {

	public static void main(String[] args) {

		Employee emp = new Employee();

		String myName = emp.empName = "Om";
		String myCity = emp.city = "goa";
		int myID = emp.emp_Id = 123465;
		double mySalary = emp.salary = 350000.0;

//		System.out.println("Default value print  = " + emp.empName);

		System.err.println("1st Employee Info ... !");
		System.out.println("Employee Name = " + myName);
		System.out.println("Employee City = " + myCity);
		System.out.println("Employee ID = " + myID);
		System.out.println("Employee Salary = " + mySalary);

		System.out.println("Thank u ... ! ");

		Employee emp1 = new Employee();

		String myName1 = emp1.empName = "Ram";
		String myCity1 = emp1.city = "pune";
		int myID1 = emp1.emp_Id = 123464;
		double mySalary1 = emp1.salary = 500000.0;

		System.err.println("2nd  Employee Info ... !");

		System.out.println("Employee Name = " + myName1);
		System.out.println("Employee City = " + myCity1);
		System.out.println("Employee ID = " + myID1);
		System.out.println("Employee Salary = " + mySalary1);
		System.out.println("Thank u ... !");
	}

}
