package com.stringexamples;

import java.util.Scanner;

public class StringEqualsExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String1");
		String input = sc.next();

		System.out.println("Please enter the String2");
		String input2 = sc.next();

		if (input.equalsIgnoreCase("Srikanth")) {
			System.out.println("Welome to login page");
		} else {
			System.out.println("Username is invalid");
		}

		if (input2.equals("Jenny")) {
			System.out.println(" username and password correct");
		} else {
			System.out.println("password is invalid");
		}
	}

}
