package oops;

public class RulesConstructor {

	static int count = 0;

	{
		System.out.println(count);
		count++;
	}

	RulesConstructor() {
		// TODO Auto-generated constructor stub
		super();
		// this(2);
		System.out.println("Default Cnstructor ");

	}

	//
	RulesConstructor(int i) {

		System.out.println("int constructor ");
	}

	public RulesConstructor(float s) {
		// TODO Auto-generated constructor stub
		System.out.println("Hello This");
	}

	////
	RulesConstructor(double d) {
		System.out.println("double constructor ");
	}

	public static void main(String args[]) {

		RulesConstructor r = new RulesConstructor();
		RulesConstructor r1 = new RulesConstructor(10);
		RulesConstructor r2 = new RulesConstructor(10.3f);

		System.out.println("The no. Of counts created " + count);
	}
}

// 0 Hii dfc the no.of counts created 1 --> k

// 0 Hii dfc the no.of counts created 1 --> p
/*
 * 1-> The name of the constructor and name of method of the class must be same
 * 2-> return type concept is not applicable for constructor 3-> the only
 * applicable modifiers for constructors are public,private, protected and
 * default.
 */
