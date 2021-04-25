package com.stringexamples;

public class ArraysDemo1 {

	public static void main(String[] args) {
		int age[] = { 22, 24, 25, 27, 29 };

		for (int a = 0; a < age.length; a++) {
			System.out.println("Element at index :" + a + " : " + +age[a]);
		}

		System.out.println(age[2]);//25
		System.out.println(age[4]);//29
		System.out.println(age[5]);//ArrayIndexOutOfBoundsException
	}

}
