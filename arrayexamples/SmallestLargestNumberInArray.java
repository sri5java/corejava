package arrayexamples;

import java.util.*;

public class SmallestLargestNumberInArray {

	public static void main(String args[]) {

		// Given Array
		int[] inputArr = { 10, 43, 27, 98, 75, 59, 191 };

		// Setting largest value
		int largest = inputArr[0];

		// Setting smallest value
		int smallest = inputArr[0];

		// Iterate through the Given Array
		for (int number : inputArr) {
			if (number > largest) {
				largest = number;
			} else if (smallest > number) {
				smallest = number;
			}
		}
		System.out.println("Largest and Smallest numbers are " + largest + " " + smallest);
	}

}
