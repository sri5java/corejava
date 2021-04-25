package com.threadexamples;

public class TestDemo {

	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		t.method1();
		System.out.println("Main method started");
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println("Main method end");

	}

	public void method1() {
		System.out.println("method1 started");
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
		System.out.println("method1 ended");
	}
}
