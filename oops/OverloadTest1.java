package oops;

public class OverloadTest1 {

	public void m1() {
		System.out.println("no args");
	}

	public void m1(int i) {
		System.out.println("int args " + i);
	}

	public void m1(char c) {
		System.out.println("char args");
	}

	public void m1(double f) {
		System.out.println("double -args");
	}

	public void m1(float f) {
		System.out.println("float -args");
	}

	public static void main(String args[]) {
		OverloadTest1 t1 = new OverloadTest1();

		t1.m1('d');
		t1.m1(10);
		t1.m1(10.5f);
		t1.m1(97);

	}
}
