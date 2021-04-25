package declarationsandaccessmodifiers;

public class StaticTest {
	
	int x;
	static int y =20;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest st = new StaticTest();
		
		st.x=888;
		y=999;
		
		System.out.println(st.x + "  " + StaticTest.y);
		
		StaticTest st2 = new StaticTest();
		
		System.out.println(st2.x + "  " + y);
		

	}
	
	public static void main(int[] args){
		System.out.println("int[] ");
	}

}
