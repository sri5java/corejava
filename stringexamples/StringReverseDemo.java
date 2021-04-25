package com.stringexamples;

import java.util.Scanner;

public class StringReverseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String input = sc.next();

//		char[] c = input.toCharArray();
//		System.out.println("Reverse String :");
//		for (int i = c.length - 1; i >= 0; i--) {
//			System.out.print(c[i]);
//		}

		StringBuilder input2 = new StringBuilder();
		input2.append(input);
		input2.reverse();
		System.out.println(input2);

	}
}
