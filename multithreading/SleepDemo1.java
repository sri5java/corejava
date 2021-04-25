package multithreading;

public class SleepDemo1 extends Thread {
	public void run() {

		for (int i = 0; i <= 50; i++) {
			System.out.println("t1: " + i);
		}
		System.out.println("End of t1");
	}

	public static void main(String args[]) { //
		SleepDemo1 s1 = new SleepDemo1();
		 s1.setDaemon(true);

		s1.start();

		 s1.isDaemon();

		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(s1.isDaemon());
		
		for (int i = 100; i <= 150; i++) {
			System.out.println("Main : " + i);
		}
		System.out.println("End of the main");

	}
}
