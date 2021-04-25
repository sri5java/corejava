package oops;

public class OverloadTest {

	public void m1() {
		System.out.println("no args");
	}

	public void m1(long i) {
		System.out.println("long args" + i);
	}

	public void m1(double i) {
		System.out.println("double args" + i);
	}

	// public void m1(float f){
	// System.out.println("float -args");
	// }

	public static void main(String args[]) {

		OverloadTest ot = new OverloadTest();
		ot.m1(); // no args
		ot.m1(123456789000l);// int
		ot.m1(10.5f); // floating

	}
}
