package arrayexamples;

public class SumOfArray {
	public static void main(String args[]) {

		// Given Array
		int[] inputArr = { 10, 43, 27, 98, 75, 59, 191 };

		int sum = 0;

		// Iterating through the Array
		for (int num : inputArr) {
			sum = sum + num;
		}

		System.out.println(sum);

	}

}
