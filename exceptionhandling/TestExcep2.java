package exceptionhandling;

public class TestExcep2 {
	public static void main (String args[]){
		int n=20,result=0;
		try{
			
			System.out.println("In try Statement 1");

			result= n/0;
	        System.out.println("The result is " +result);
		}catch(ArithmeticException e){
			System.out.println("In catch");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		catch(NullPointerException ne){
			System.out.println("In NPE catch");
			ne.printStackTrace();
		}
		
		System.out.println("After Catch");
	}
}
