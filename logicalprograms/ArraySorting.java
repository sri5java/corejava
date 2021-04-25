package logicalprograms;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 5, 7, 6, 3, 9, 4 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		System.out.println("Sorted in ascending order");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
