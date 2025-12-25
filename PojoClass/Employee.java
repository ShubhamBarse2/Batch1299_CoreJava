package PojoClass;

// POJO 

public class Employee {

	int empId; // pojo class members/fields/Variables/attributes // 0
	String empName; // null
	double empSalary; // 0.0
	String city; // null

	public Employee() { // No args Constructor

	}

	public Employee(int empId, String empName, double empSalary, String city) { // Args Constructor
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.city = city;

	}

	public int getEmpId() { // public getters & setters using fields
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// toString using fields

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", city=" + city
				+ "]";
	}

}
