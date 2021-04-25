package logicalprograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = reverseString("Srikanth");
		System.out.println(rev);
	}

	static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;

	}

}
