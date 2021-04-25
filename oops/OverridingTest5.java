package oops;

class P4 {
	public void m1(int... i) {
		System.out.println("Prent");
	}
}

class C4 extends P4 {
	public void m1(int... p) { // it is overloading but not overriding because
								// of of var arg.
		System.out.println("Child");
	}
}

public class OverridingTest5 {
	public static void main(String args[]) {

		P4 p = new P4();
		p.m1();

		C4 c = new C4();
		c.m1(0);

		P4 p1 = new C4();
		p1.m1();

	}
}
