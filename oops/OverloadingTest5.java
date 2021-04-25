package oops;

public class OverloadingTest5 {

	public void m1(int i) {
		System.out.println("general method ");
	}

	public void m1(float... f) {
		System.out.println("Var arg method");
	}

	public static void main(String args[]) {
		OverloadingTest5 t5 = new OverloadingTest5();

		t5.m1();
		t5.m1(15.0f, 780, 90, 'd');
		t5.m1(10, 20);
		t5.m1(10);
	}
}
