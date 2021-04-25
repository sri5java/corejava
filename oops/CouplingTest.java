package oops;

class A1 {
	B1 b = new B1();
	int i = b.j;
}

class B1 {
	C2 c = new C2();
	int j = c.k;

}

class C2 {
	D1 d = new D1();
	int k = d.m1();
}

class D1 {
	public static int m1() {
		return 10;
	}
}

public class CouplingTest {
	public static void main(String args[]) {
		D1 d = new D1();
		C2 c = new C2();

		System.out.println(d.m1());
		// System.out.println();
	}

}
