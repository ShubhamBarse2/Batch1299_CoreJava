package PojoClass;

public class EmpInfo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(123);
		e.setEmpName("soham");
		e.setEmpSalary(3456.78);
		e.setCity("nsk");
		System.out.println(e);
	}

}
