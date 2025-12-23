package SuperThisFinal_Keywords;

public class Student {

	int rollNo;

	public Student() {
		System.out.println("no args Constr ");
	}

	public Student(String name) {
		this();
		System.out.println("my name is " + name);
	}

	void myInfo() {
		int a = this.rollNo = 234;
		System.out.println("my Roll NO is " + a);
	}

	void view() {
		this.myInfo();
		System.out.println("welcome ...! ");
	}

//	public static void main(String[] args) {
//		Student s = new Student("rahul");
//		s.view();
//
//	}

}
