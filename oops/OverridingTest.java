package oops;

class Parent2 {
	public void property() {
		System.out.println("Cash + Land + gold");
	}

	public static void marriage() { // overridden method
		System.out.println("anasuya / savitri / sushila");
	}
}

class Child1 extends Parent2 {

	public static void marriage() { // overriding method
		System.out.println("Samantha / kajal / Hanshika ");
	}

	public void m2() {
		System.out.println("M2 method");
	}
}

public class OverridingTest {

	public static void main(String args[]) {

		C c1 = new C();

		Parent2 p = new Parent2();
		p.marriage();
		p.property();

		Child1 c = new Child1();
		c.marriage();
		c.property();

		Parent2 p1 = new Child1();
		p1.marriage();

		// p1.m2();

		// Child1 c2= new Parent2();

	}
}
