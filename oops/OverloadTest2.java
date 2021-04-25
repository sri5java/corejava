package oops;

public class OverloadTest2 {

	public void m1(String s) {
		System.out.println("String version   " + s);

	}

	public void m1(Object o) {
		System.out.println(" Object version");
	}

	public static void main(String args[]) {
		OverloadTest2 t2 = new OverloadTest2();

		t2.m1("Sri");
		t2.m1(t2); // Object version
		t2.m1(null); // String version

	}
}
