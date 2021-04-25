package logicalprograms;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 };

		System.out.print("Given arry ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.print("reverse arry ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i] +" ");
		}

	}

}
