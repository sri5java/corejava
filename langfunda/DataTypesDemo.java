
package langfunda;

import java.util.*;

public class DataTypesDemo {

	//Numerical data types
	//integral data types
	byte b;   	//0
	short s;  	//0
	
	int i;  	//0
	long l;		//0

	//floating data types
	float f; 	//0.0
	double d;	//0.0
	
	//non- numerical 
	char c;		//'u0000'
	boolean flag;	//false

	public static void main(String[] args) {

		 byte b1=10; //  
		 byte b2=127; // 
//		 byte b3=128; // 
//		 byte b4=10.5; //  
//		 byte b5=true; //
//		 byte b6='s'; //
//		 System.out.println("byte " +b6);

		 
		 short s1=32767; //
//		 short s2=32768; //
//		 short s3=10.5; //
//		 short s4=true; //

		 int i1=2147483647; //valid
//		 int i2=2147483648; //
//		 int i3=10.5; //
//		 int i4=true; //

//		 long l1=12600*60*60*24*1000; //
		 long l1=2147483648L;
		 System.out.println("l1 value :" + l1);

		 float f1=5.012345222f; // 5--> 6 decimal places
		 System.out.println(f1);

		 double d=5.0123455765f; //
//		 float f2=5.0123455765d;   // 

		 boolean b4=false; // 
//		 boolean b5=0; //
//		 boolean b=True; //
//		 boolean b7="true"; //

		 
//		 ASCII--> A-65, B-66, C-67------- Z=91 ---- a-97, b-98
		 char ch=94; // 
		 System.out.println("Char " +ch);
		
		// String s=null;

		DataTypesDemo d1 = new DataTypesDemo();
		
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
