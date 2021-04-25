package com.stringexamples;

public class ArraysDemo {

	public static void main(String[] args) {

//		int a = 100;
//		int a1 = 200;
//		int a2 = 300;
//		int a3 = 400;
//		int a4 = 500;
//		int a5 = 600;
//
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);
//		System.out.println(a5);

		// 1st way
//		int[] x = new int[6];
//		x[0] = 100;
//		x[1] = 200;
//		x[2] = 300;
//		x[3] = 400;
//		x[4] = 500;
//		x[5] = 500;
//
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[3]);
//		System.out.println(x[4]);
//		System.out.println(x[5]);

		// 2nd way
		int[] y = { 100, 200, 300, 400, 500, 600 };// 6

//		for (int i = 0; i < y.length; i++) {
//			System.out.println(y[i]);
//		}

		for (int y1 : y) {
			System.out.println(y1);
		}
	}
}
