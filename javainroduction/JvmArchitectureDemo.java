package javainroduction;

public class JvmArchitectureDemo {

	// instance data will be loading to Heap Area
	int a = 100;
	int b = 200;

	// static data will be loading to method Area
	static String name = "Java";

	public static void main(String[] args) {
		System.out.println("Hello welcome to eclipse");
		// jd is a reference variable
		// new JvmArchitectureDemo() object creation
		JvmArchitectureDemo jd = new JvmArchitectureDemo();

		System.out.println(jd.a);
		System.out.println(jd.b);

		System.out.println(name);

		// Method calls and execution of the method will be going to store
//		inside Stack area 
		jd.addition();
		jd.method1();
		method2();
		SaiInfo.method2();
	}

	void addition() {
		System.out.println("Inside addition method");
		int a = 200;
		int b = 300;
		int c = a + b;
		System.out.println("Sum of the two numbers : " + c);
	}

	void method1() {
		System.out.println("Inside method1");
	}

	static void method2() {
		System.out.println("Inside method2");
	}
}

class SaiInfo {
	static void method2() {
		System.out.println("Inside SaiInfo method2");
	}
}
