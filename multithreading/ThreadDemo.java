package multithreading;

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();

//		t.start();
		t.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}
	}
}
