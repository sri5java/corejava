package exceptionhandling;

public class TestExp7
{
public static void main(String args[])
{
  System.out.println(m1());
}
static public int m1()
{
try
{
  return 777;
}
catch(NullPointerException e)
{
  System.out.println("catch");
  return 888;
}
  finally
  {
   return 999;
  } 
}
}
