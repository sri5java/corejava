package com.threadexamples;

public class RunnableDemo extends TestDemo implements Runnable {

	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Main method started");
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println("Main method ended");
	}

	@Override
	public void run() {
		System.out.println("run method started");
		for (int i = 100; i < 500; i++) {
			System.out.println(i);
		}
		System.out.println("run method started");
	}

}
