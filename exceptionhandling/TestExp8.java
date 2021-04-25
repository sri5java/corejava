package exceptionhandling;


public class TestExp8
{
public static void main(String args[])
{
try
{
  System.out.println("try");
  System.exit(0);
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

