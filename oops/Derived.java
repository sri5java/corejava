package oops;

public class Derived extends Base {
	/* 6 */static int x = 100; // 17

	/* 7 */static {
		m2(); // 18
		System.out.println("Dervied First Sb"); // 20
	}

	/* 8 */public static void main(String args[]) {
		m2(); // 23
		System.out.println("Derived main"); // 25

		P p = new P();
		p.m1();
	}

	/* 9 */public static void m2() {
		System.out.println(y); // 19, 24
	}

	/* 10 */static {
		System.out.println("DSSB"); // 21
	}

	/* 11 */static int y = 200; // 22

}
