package com.stringexamples;

public class ComparisionDemo {

	public static void main(String[] args) {
		String s = "Hell";
		String s1 = "Hello";
		String s2 = "Hello";

		String s3 = new String("Hell");

		if (s.equals(s3)) {
			System.out.println("Hell and heven");
		}

		if (s == s3) {
			System.out.println("Hello String");
		}

		if (s1 == s2) {
			System.out.println("Hello String constant pool ");
		}

		// -----------------
		String s5 = "Abhi";
		String s6 = "Aehie";
		String s7 = "Abhi";
		System.out.println(s5.compareTo(s6)); 
		System.out.println(s5.compareTo(s7)); 
//		s5.compareTo(s5);

	}

}
