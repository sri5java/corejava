package com.stringexamples;

public class StringDemo1 {

	public static void main(String[] args) {
		// Immutable objects
		String s = "Sri";
		String s1 = "Kanth";
		String s2 = s.concat(s1);
		System.out.println("Name of the person : " + s2);

		// ----------------------------------------------
		// Creation of an objects
		String str1 = "Hello";
		String str2 = new String(str1);

		String str3 = new String("World");
		String str4 = str1 + str3;

		System.out.println(str4);

		// --------------------------------------------

		String sr = "java";
		String sr1 = "java";
		sr1= sr1.concat("book");
		
		System.out.println(sr1);

	}
}
