package exceptionhandling;

public class TestExp6
{
public static void main(String args[])
{
try
{
  System.out.println("try...");
  System.out.println(10/0);
//  System.exit(0);
}
catch(ArithmeticException e)
{
  System.out.println("catch");
  return;
}
  finally
  {
   System.out.println("finally");  
  }
}

}
