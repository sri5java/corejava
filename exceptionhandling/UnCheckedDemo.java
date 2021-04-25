package exceptions;

public class UnCheckedDemo {

	public static void main(String args[]) {

		// 1
		int a = 100;
		int b = 20;
		int c = a / b;
		System.out.println("C values :: " + c);

		// 2
		String s = "Srikanth";
		int i = s.length();
		System.out.println("String value " + i);

		// 3
		int j[] = new int[5];
//		j[10] = 50;

		// 4

		String s2 = "abc";
		int i2 = Integer.parseInt(s2);

	}

}
