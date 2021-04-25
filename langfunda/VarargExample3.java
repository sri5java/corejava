package langfunda;

public class VarargExample3 {
	
	public void m1( int ...x){
		System.out.println("var arg");
	}
	
	
	
	
	
	public void m1(int x){
		System.out.println("General");
		
	}
	
	public void m1(){
		System.out.println("General for no arg");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarargExample3 v3 = new VarargExample3();
		v3.m1();
		v3.m1(10, 20);
		v3.m1(10);
		
	}

}
