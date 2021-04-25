package com.stringexamples;

public class StringFunctions {

	public static void main(String[] args) {
		String s = "Java";
		char c = s.charAt(2);
		System.out.println(c);

		String str = "java";
		System.out.println(str.equalsIgnoreCase("JaVa"));
		System.out.println(str.equals("JaVa"));

		String str1 = "New Year";
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.indexOf('e', 2));

		System.out.println(str1.length());

		String str2 = "   Srikanth  Srikanth   srikanth   ";
		System.out.println(str2.trim());
		System.out.println(str2.replaceAll("\s", ""));

		String str3 = "Raju";
		System.out.println(str3.replace('R', 'K'));

		String str4 = "This is Java class";
		System.out.println(str4.substring(10));// va class
		System.out.println(str4.substring(4, 10));// is Ja

		String str5 = "JAVA";
		System.out.println("Upper Case to Lower Case : " + str5.toLowerCase());

		String str6 = "hello";
		System.out.println("Lower case to Upper Case : " + str6.toUpperCase());

		int num = 100;
		String str7 = String.valueOf(num);
		System.out.println(str7);
		
		String str8 ="200";
		int num2 = Integer.valueOf(str8);
		int num1 = num2 + 100;

	}
}
