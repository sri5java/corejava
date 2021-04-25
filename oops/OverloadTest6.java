package oops;

class Animal {

}

class Monkey extends Animal {

}

public class OverloadTest6 {

	public void m1(Animal a) {
		System.out.println("Animal Version ");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String args[]) {
		OverloadTest6 t6 = new OverloadTest6();

		Animal a = new Animal();
		t6.m1(a); // Animal version

		Monkey m = new Monkey();
		t6.m1(m); // Monkey version

		Animal a1 = new Monkey();
		t6.m1(a1); // Animal version
	}
}
