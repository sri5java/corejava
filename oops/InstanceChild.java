package oops;

public class InstanceChild extends InstanceParent {
	/* 9 */int x = 100;// 21

	/* 10 */ {
		m2();// 22
		System.out.println("Child FIB");// 24
	}

	public InstanceChild() {

		/* 11 */System.out.println("Child constructor..!!! " + y);// 27
		// TODO Auto-generated constructor stub
	}

	/* 2 */public static void main(String arsgs[]) {
		/* 3 */InstanceChild is = new InstanceChild();
		System.out.println("Child main method");// 28
	}

	/* 12 */public void m2() {
		System.out.println(y);// 23
	}

	/* 13 */ {
		System.out.println("Child SIB");// 25
	}

	/* 14 */int y = 200;
}
