package com.stringexamples;

public class SumAverageDemo {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 40, 30, 60, -50, -40 };
		int sum = 0;
		double average = 0.0;

		for (int number : numbers) {
			sum += number;
		}

		int length = numbers.length;
		System.out.println("SUm of the values : " + sum);

		average = ((double)sum / (double)length);

		System.out.println("Average of the elements " + average);

	}

}
