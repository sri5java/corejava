package oops;

class P5 {
	int x = 888;
}

class C5 extends P5 {
	int x = 999;
}

public class OverridingTest6 {
	public static void main(String args[]) {
		P5 p = new P5();
		System.out.println("P value :" + p.x);

		C5 c = new C5();
		System.out.println("C value :" + c.x);

		P5 p1 = new C5();
		System.out.println("P value with child Obj :" + p1.x);
	}
}
