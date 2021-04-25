package logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int m = 0;
		int flag = 0;

		int n = 4; // to be checked.

		m = n/2 ;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime");
			}
		}

	}

}
