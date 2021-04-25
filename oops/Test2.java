package oops;

//For static variable 1

public class Test2 {
	static int count;

	public int stuff() {
		return count++;
	}

	public static void main(String args[]) {
		Test2 ref = new Test2();

		System.out.println(ref.stuff());
		System.out.println("the number is : " + count);

	}

}