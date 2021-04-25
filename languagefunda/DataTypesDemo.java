package languagefunda;

public class DataTypesDemo {

	byte b = (byte) -129; // 0
	byte b2 = (byte) 128;

	short s = (short) -32769; // 0
	short s1 = (short) 32768;

	int i = (int) -2147483649l; // 0 //literal out of range
	int i1 = (int) 2147483648l; // 0 //literal out of range
	int i2 = 'D';

	long l = -9223372036854775808l;// 0
	long l1 = 9223372036854775807l;// 0

	float f = 10.56784567345f;// 0.0
	double d = 10.56784567345;// 0.0

	boolean b1 = true;// false
	char c = 100; // 0 to 65535
	char c1 = 'M';
	char c2 = '\u0022';

	String s3 = "Srikanth";
	String s4;

	public static void main(String[] args) {
		int a;
		a = 100;
		System.out.println(a);

		DataTypesDemo d = new DataTypesDemo();

		System.out.println("byte value : " + d.b);
		System.out.println("short value : " + d.s);

		System.out.println("int value : " + d.i);
		System.out.println("long value : " + d.l);

		System.out.println("float value : " + d.f);
		System.out.println("double value : " + d.d);

		System.out.println("boolean value : " + d.b1);
		System.out.println("char value : " + d.c);
		System.out.println("unicode char value : " + d.c2);

		System.out.println(d.i2);
		
		System.out.println(d.s3);
		System.out.println(d.s4);

	}
}
