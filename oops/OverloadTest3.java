package oops;

public class OverloadTest3 {

	public void m1(String s) {
		System.out.println("String version");
	}

	public void m1(StringBuffer sb) {
		System.out.println("String Buffer sb");
	}

	public static void main(String args[]) {
		OverloadTest3 t3 = new OverloadTest3();

		// t3.m1("Sri5");
		// t3.m1(new StringBuffer("Sri5"));

		// t3.m1(null);
		// t3.m2(null);

	}
}
