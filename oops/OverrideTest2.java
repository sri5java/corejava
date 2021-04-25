package oops;

//it is valid but not overriding

class P {
	public Object m1() {
		System.out.println("m1 from parent ");
		return "d";
	}

	public void m3() {
		System.out.println("m3 from parent ");
	}

}

class C extends P {
	public String m1() {

		System.out.println("m1 from Child ");
		return "r";
	}

	public void m2() {
		System.out.println("m2 from Child ");
	}

	public void m4() {
		System.out.println("m4 from parent ");
	}
}

public class OverrideTest2 {
	public static void main(String argS[]) {
		P p = new P();
		// p.m1();

		P p1 = new C();
		p1.m1();
		//
		//
		C c = new C();
		// c.m1();
		// c.m2();
		// c.m3();

	}

}
