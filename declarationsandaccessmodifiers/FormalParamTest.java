package declarationsandaccessmodifiers;

public class FormalParamTest {
	
	
	public static void m1( final int x, final int y) { //formal parameters
//		x=100;
//		y=200;
		System.out.println(x + "   " + y);
		
		String s="sai";
		 s="sai Teja";
		 
		 System.out.println(s.hashCode());
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(10, 20);    // actual parameters
	}

}
