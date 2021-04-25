package oops;

public class EncapsulationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EncapsulationDemo e1= new EncapsulationDemo();

		StudentInfo s = new StudentInfo();

		s.setAge(25);
		s.setSname("Narendra");
		s.setSno(2);

		System.out.println("Student Age " + s.getAge());
		System.out.println("Student name " + s.getSname());
		System.out.println("Student No " + s.getSno());

	}
}
