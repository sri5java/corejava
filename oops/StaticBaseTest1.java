package oops;

public class StaticBaseTest1 {

	// static int x;
	//
	// static {
	// System.out.println(x);
	// }
	//
	// static {
	// x = 10;
	// System.out.println(x);
	// }
	//
	// static void m1() {
	// System.out.println(x);
	// }
	//
	// static {
	// m1();
	// }

	//
	static int x = 10;

	static {
		m1();
	}

	//
	public static void m1() {
		System.out.println(x);
		System.out.println(StaticBaseTest.i);
	}
	//
	// static int x=10;

	static {
		System.out.println(" Hello I can print");
		System.exit(0);
	}

	public static void main(String args[]) {

	}
}
