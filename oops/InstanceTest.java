package oops;

public class InstanceTest {

	/* 3 */int i = 50; // 9
	float k = 0;

	{
		/* 4 */m1(); // 10
		System.out.println("FIB"); // 12

	}

	/* 5 */public InstanceTest() {

		System.out.println("Constructor "); // 15
		// TODO Auto-generated constructor stub
	}

	/* 1 */public static void main(String[] args) {
		/* 2 */InstanceTest i1 = new InstanceTest();
		i1.m1();
		System.out.println("main" + i1.j);
	}

	/* 6 */public void m1() {
		System.out.println(j);// 11
	}

	/* 7 */ {
		System.out.println("SIB");// 13
	}

	/* 8 */int j = 20; // 14

}
