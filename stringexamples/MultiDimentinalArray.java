package com.stringexamples;

public class MultiDimentinalArray {

	public static void main(String[] args) {

		int[][] a = new int[2][3]; // --> 6

		System.out.println("a.length : " + a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}

//		double[][] matrix = { { 1.2, 4.3, 5 }, { 4.1, -1.1 } };
//
//		System.out.println(matrix[0][0]);
//		System.out.println(matrix[0][1]);
//		System.out.println(matrix[0][2]);
//		System.out.println(matrix[1][0]);
//		System.out.println(matrix[1][1]);
	}

}
