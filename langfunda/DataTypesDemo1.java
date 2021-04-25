package langfunda;

public class DataTypesDemo1 {

	byte b; // 0
	short s=32767; // 0

	int i= 0x12; // 0 
	long l=2147483648L; // 0

	// floating data types
	float f=20.12345676897532f; // 0.0
	double d=20.123456768975321111111111111; // 0.0

	// non- numerical
	char c='F'; // 'u0000'
	boolean flag;

	public static void main(String args[]) {
		DataTypesDemo1 d1 = new DataTypesDemo1();

		System.out.println("byte : " + d1.b);
		System.out.println("short : " + d1.s);
		System.out.println("int : " + d1.i);
		System.out.println("long : " + d1.l);
		System.out.println("float : " + d1.f);
		System.out.println("double : " + d1.d);
		System.out.println("char : " + d1.c);
		System.out.println("boolean : " + d1.flag);

	}

}
