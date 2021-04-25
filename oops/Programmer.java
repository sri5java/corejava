package oops;

class Employee {
	static int age = 26;
	static float salary = 40000;

	public void sal() {
		System.out.println("Sal: " + salary);
	}

	String name = "Sri";
}

class Programmer extends Employee { // child class or Sub class
	int bonus = 10000;

	public static void main(String args[]) {

		Programmer p = new Programmer();

		p.sal();
		System.out.println("Age " + Employee.age);
		System.out.println("Bonus of Programmer is:" + p.bonus);
		System.out.println("Employee Name  is:" + p.name);

	}
}
