package languagefunda;

public class LiteralsDemo {

	int a = 17899; // Integral Literal 0 - 9
	int b = 067; // Octal Literal 0 - 7 --> 8(1)*6 +8(0)*7 = 48+7 = 55
	int c = 0x123;// Hexa Decimal Values 0 -9 (10) and a-f (6 ) = 16(2)*3 + 16(1)*2 + 16(0)*3=
	int d = 0xbeef;//

	char c1 = '\u0020';
	String s1 = null;
	boolean b1 = false;
	boolean b2 = true;

	float f = 0123.123f;
	double d1 = 0123;

	public static void main(String[] args) {
		LiteralsDemo l = new LiteralsDemo();
		System.out.println(l.a);
		System.out.println(l.b);
		System.out.println(l.c);
		System.out.println(l.d);

		System.out.println(l.c1);
		System.out.println(l.s1);
		System.out.println(l.b1);

		System.out.println(l.f);
		System.out.println(l.d1);

	}
}
