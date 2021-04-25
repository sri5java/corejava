package oops;

public class OverloadingTest4 {

	public void m1(int i, float f) {
		System.out.println("int-float version");

	}

	public void m1(int i, int j) {
		System.out.println("int-int version");

	}

	public void m1(float f, int i) {
		System.out.println("float int version");
	}

	// int-> long->float->double

	public static void main(String args[]) {
		OverloadingTest4 t4 = new OverloadingTest4();

		// t4.m1(10, 10.5f);
		// t4.m1(10.5f, 10);
		// t4.m1(10, 10);
		// t4.m1(10.5f, 10.5f);

		// t4.m1('a',10.5f);
		// t4.m1('a',10.5);
		// t4.m1(15.5f,10L);

	}
}
