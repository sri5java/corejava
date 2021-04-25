package multithreading;

public class SleepDemo3 extends Thread {
	public static void main(String args[]) {
		long x = 0;
		boolean flag = true;

		while (flag) {
			x = x + 1;
			System.out.println(x);
		}

		while (flag) {
			x = x + 1;
			System.out.println(x);

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
