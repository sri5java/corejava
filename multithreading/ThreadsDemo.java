package com.threadexamples;

public class ThreadsDemo extends Thread {

	public static void main(String[] args) {
		ThreadsDemo t1 = new ThreadsDemo();
//		t1.run();
		t1.start();// causes the Thread execution
		t1.run(100);

		System.out.println("Main method started");
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}
		System.out.println("Main method end");

	}

	public void run() {
		System.out.println("run method started");
		for (int i = 500; i < 1000; i++) {
			System.out.println(i);
		}
		System.out.println("run method end");
	}

	public void start() {
		System.out.println("start ");
	}

	public void run(int i) {
		System.out.println(i);
	}

}
