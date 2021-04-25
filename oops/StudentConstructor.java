package oops;

public class StudentConstructor {
	String name;
	int rollNo;

	public StudentConstructor(String name1, int rollNo1) {
		// TODO Auto-generated constructor stub
		this.name = name1;
		this.rollNo = rollNo1;
		System.out.println("Hi Constructor");

	}

	static {
		System.out.println("Hi static ");
	}

	//
	{
		System.out.println("Hi instance1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");

		// StudentConstructor s3 = new StudentConstructor();

		StudentConstructor s = new StudentConstructor("Sri", 10);
		System.out.println(s.name + "   " + s.rollNo);

		StudentConstructor s2 = new StudentConstructor("Venkat", 11);
		System.out.println(s2.name + "   " + s2.rollNo);
	}

}
