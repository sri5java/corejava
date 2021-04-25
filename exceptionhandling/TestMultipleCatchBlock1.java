package exceptionhandling;

class TestMultipleCatchBlock1{  
	  public static void main(String args[]){  
	   try{  
	    int a[]=new int[5]; 
	    
	    String s= null;
	    s.trim();
	    a[0]=1;
	    a[4]=10;
	    a[5]=30/10;  
	    
	    
	   }  
	     
	   catch(ArithmeticException e){
		   System.out.println("task1 is completed");
		   }  
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("task 2 completed");
		   }
	   catch(Exception e){System.out.println("common task completed");}
	   System.out.println("rest of the code...");  
	 }  
	}  