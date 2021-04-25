package langfunda;

public class TestVariables {
	
	
	 int x;			  //primitive type and instance behaviour
	 
	 static String schoolName ="XYZ_SCHOOL";  //static and reference 
	 static int y;//primitive and static
	 
	
	public static void main(String[] args){
		
		int x=7;  
		int y=10;
		System.out.println("Value of X :" + x+  "  " +y); // we can't access instance variable from static area 
		
		TestVariables t1= new TestVariables();
		TestVariables t2= new TestVariables();
		TestVariables t3= new TestVariables();
																							//Division 1 : primitive and reference ...
																							//Division 2: instance, static and local variables.
		
		
		TestVariables.methodOne();
		System.out.println(t1.x);
		System.out.println(t2.x);
		System.out.println(t3.x);
		
		System.out.println(TestVariables.schoolName); //
		
	
	}
	
	public static void methodOne(){
		
		System.out.println(TestVariables.y);//
		System.out.println(TestVariables.schoolName);  //
	}
}
