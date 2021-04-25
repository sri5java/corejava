package exceptionhandling;



import java.io.*;
public class TectCheckedExcep
{
	
	//checked Exception 
  public static void main(String args[])
  {
    FileInputStream fis = null;
    try
    {
      fis = new FileInputStream("abc.txt");
    }
    catch(Exception e)
    {
      System.out.println("The source file does not exist. " + e);
    }          
     
    int k;
    try
    {
      while(( k = fis.read() ) != -1)
      {
        System.out.print((char)k);
      }
      fis.close();
    }
    catch(IOException e)
    {
      System.out.println("Some IO problem. " + e);
    }          
  }
	
	//unchecked by the compiler 
//		   public static void main (String args[])throws Exception  {
//		      int n=20,result=0;
//		      try{
//		         result=n/0;
//		         System.out.println("The result is"+result);
//		      }
//		      catch(ArithmeticException ex){
//		         System.out.println("Arithmetic exception occoured: "+ex);
//		         try {
//		         throw new NumberFormatException();
//		         }
//		         catch(NumberFormatException ex1) {
//		            System.out.println
//		            ("Chained exception thrown manually : "+ex1);
//		         }
//		      }
//		   }
		
}