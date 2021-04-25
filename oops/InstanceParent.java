package oops;

public class InstanceParent {
	/* 4 */int i = 0;// 5

	/* 5 */ {
		m1();// 16
		System.out.println("Parent IB");// 18
	}

	/* 6 */public InstanceParent() {

		System.out.println(" Parent Constructor  : " + j);// 20
		// TODO Auto-generated constructor stub
	}

	/* 1 */public static void main(String args) {
		InstanceTest ip = new InstanceTest();

		System.out.println("Parent main");
	}

	/* 7 */public void m1() {
		System.out.println(j);// 17
	}

	/* 8 */int j = 20;// 19
}
