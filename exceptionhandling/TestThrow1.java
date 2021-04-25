package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestThrow1 {

	static void validate(int age) {
		if (age < 18)
			throw new NullPointerException("not valid");

		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) throws FileNotFoundException, InterruptedException {

		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");

		Thread.sleep(1000);

		validate(16);
		System.out.println("rest of the code...");
	}
}
