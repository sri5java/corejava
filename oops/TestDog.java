package oops;

class Animal1 {

	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal1 {

	public void move() {
		System.out.println("Dogs can walk and run");
	}

	public void bark() {
		System.out.println("Dogs can bark");
	}
}

public class TestDog {

	public static void main(String args[]) {
		Animal1 a = new Animal1(); // Animal reference and object
		Animal1 b = new Dog(); // Animal reference but Dog object

		a.move();// runs the method in Animal class
		b.move();// Runs the method in Dog class
		// b.bark();
	}
}