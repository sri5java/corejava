package oops;

import java.io.*;

class P3 {
	public static void m1() throws IOException {

	}
}

class C3 extends P3 {
	public static void m1() throws EOFException {
		System.out.println("Hiii");

	}

	// public void m1() throws IOException{
	//
	// }
}

public class OverridingTest4 {

	public static void main(String args[]) throws IOException {
		System.out.println(" OverridingTest4");

		P3.m1();

		C3 c = new C3();
		c.m1();

	}
}
