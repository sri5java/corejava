package exceptionhandling;

public class TestExcep1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		int[] a = new int[3]; // creation of single D array

		try {
			a[0] = 100;
			a[1] = 101;
			a[2] = 102;
			a[3] = 109;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(a);

		int[][] x = new int[2][];
		x[0] = new int[3];
		x[1] = new int[2];

		x[0][0] = 5;
		x[0][1] = 6;
		x[0][2] = 7;

		x[1][0] = 8;
		x[1][1] = 9;
		// x[1][2]=10;

		int[][][] y = new int[2][][];

		y[0] = new int[3][1];
		y[0][0] = new int[2];

		y[0][1] = new int[1];
		y[0][2] = new int[2];

		y[1] = new int[2][2];

		System.out.println("Array creation : " + y[0]);
		// System.out.println(a.getClass().getName());

	}
}
