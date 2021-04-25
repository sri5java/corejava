package oops;

//FOr inheritance 

class ParentExample {

	public void m1() {
		// m1 method
		System.out.println("Hiii m1 From Parent ");
	}

	public void m5() {
		// m1 method
		System.out.println("Hiii m5 From Parent");
	}

	public void m6() {
		// m1 method
		System.out.println("Hiii m6 From Parent");
	}
}

class Child extends ParentExample {

	public void m2() {
		System.out.println("Hiii m2 From Child");
		// m2 method
	}

}

public class InheritanceDemo {
	public static void main(String args[]) throws Throwable {

		InheritanceDemo t1 = new InheritanceDemo();
		// t1.finalize();
		// t1.hashCode();

		ParentExample p = new ParentExample(); // object creation for parent
		p.m1(); //
		p.m5();
		p.m6();

		// p.m2();

		Child c = new Child(); // Object creation for child
		c.m1();
		c.m5();
		c.m6();
		c.m2();
		// //
		//
		// //
		// //
		ParentExample p1 = new Child();
		p1.m1();
		// p1.m2();
		//
		// Child c1 = new ParentExample();

	}
}
