package logicalprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int c = 0;
		int n = 153;

		int temp = n;

		while (n > 0) {

			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);

		}

		if (temp == c) {
			System.out.println("Arm strong number");
		} else {
			System.out.println("not an arm strong number");
		}

	}

}
