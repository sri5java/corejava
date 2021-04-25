package oops;

public class StaticBaseTest {
	/* 1 */ static int i = 10; // 7

	/* 2 */ static {
		m1(); // 8
		System.out.println("FSB"); // 10
	}

	//
	/* 3 */public static void main(String args[]) {
		m1(); // 13
		System.out.println("Main method " + i); // 15
	}

	/* 4 */ public static void m1() {
		System.out.println(j); // 9 , 14

	}

	/* 5 */static int j = 100; // 11

	/* 6 */ static {
		m1();
		System.out.println("SSB"); // 12
	}
}

// 0
// fsb
// 100
// ssb
// 100
// main method 10