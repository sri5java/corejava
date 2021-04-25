package langfunda;

public class LiteralsTest {
	
	public static void main(String args[]){
		int x=10;
		int x1=010;
		int x2=0x10;
		
		
		
//		int l = 10L;
		
		float f= 2134.123f;
		double d = 123456.789D;
		
		
		double d2 = 123.456;
		double d3 = 0123.456;
		
//		double d = 0x123.456;
		
		double d4 = 0786.0;
		double d5=786;
		
		
		
		float f3= 2134.123f;
		float f2 = 1.2e3F;
		double d1 = 123456.789;
		double d7 = 0183.768;
//		double d8 = 0x123.456;
//		double d9=0xface;
		double d9= 1.2e3;
		
		
		char ch='h';
		char ch1=127;
//		char ch2=65536;
		char ch3='\uface';
		char ch4='\u0062';
//		char ch5='\ibeef';
//		char ch6=\u0056;
		
		System.out.println(ch +" " +ch1 +" " +ch3 + " " +ch4);
		
		

		
		char ch7='\f';
		
//		String s = null;
		String s="    ";
		
		boolean b ;
//		System.out.println(s.length());
		
		int x3=0123;
		System.out.println("Literals " + x1 +"  " + x3 + "  " +x2 + "   " + "d9: "+ d9 + "    " + ch7 +"  "+ ch3 + "  ");
		
	}
}
