package langfunda;

public class Testvariables1 {
	static int x = 100;
	
	 
	public static void main(String args[]) {
		
		
		Testvariables1 t1 = new Testvariables1();
		Testvariables1 t2 = new Testvariables1();
		Testvariables1 t3 = new Testvariables1();
		Testvariables1 t4 = new Testvariables1();
		
		
		 System.out.println(t1.x);
		 System.out.println(t2.x);
//		 System.out.println(t3.y);
		 
//		 System.out.println(x);
		 t1.m1();

	}

	public static void m1() {
		System.out.println(x);
	}
}
