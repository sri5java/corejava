package oops;

public class OverLoadTest7 {

	// byte - short- int - long - float - double

	public double muliplication(float x, int y) {

		return x * y;

	}

	public int muliplication(int i, int j) {

		return i * j;
	}

	public int mutiplication(int i, int j, int k) {

		return i * j * k;
	}

	public static void main(String args[]) {

		OverLoadTest7 o7 = new OverLoadTest7();

		double m1 = o7.muliplication(10, 20);
		System.out.println("Mulitlipication of two numbers :::" + m1);

		int m2 = o7.mutiplication(2, 3, 4);
		System.out.println("muliplication of three numbers :::" + m2);

		double m3 = o7.muliplication(5.0f, 20);
		System.out.println("Mulitlipication of two numbers :::" + m3);

	}

}
