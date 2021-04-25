package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TestExp5 extends RuntimeException
{
	 public static void main(String args[]) throws ArithmeticException
	 {
	  try{
	 System.out.println(10/0);
	  }
	  catch(ArithmeticException e){
		 
	  }
	  finally{
	  
	  }
	 
	 
//	 e.printStackTrace();
	 System.out.println("Hello");
//	 System.out.println(e.toString());
//	 System.out.println(e.getMessage());
	 }
	
	 }

	/*
	 * public static void main(String args[]) { try { int data = 25 / 5;
	 * System.out.println(data); } catch (NullPointerException e) {
	 * System.out.println(e); } finally {
	 * System.out.println("finally block is always executed"); }
	 * System.out.println("rest of the code..."); }
	 */

	/*
	 * public static void main(String args[]) { try { int data = 25 / 0;
	 * System.out.println(data); } catch (NullPointerException e) {
	 * System.out.println(e); } finally {
	 * System.out.println("finally block is always executed"); }
	 * System.out.println("rest of the code..."); }
	 */

	// public static void main(String args[]) {
	// try {
	// System.out.println("try");
	// // System.out.println(10/0);
	// } catch (Exception e) {
	// System.out.println("catch");
	// } finally {
	// System.out.println("finally");
	// }
	// }

	// public static void main(String args[]) {
	// try {
	// System.out.println("try");
	// System.out.println(10 / 0);
	// } catch (NullPointerException e) {
	// System.out.println("catch");
	// } finally {
	// System.out.println("finally");
	// }
	//
	// System.out.println("outside");
	// }

	// public static void main(String args[]) {
	// try {
	// System.out.println("try");
	// return;
	// } catch (NullPointerException e) {
	// System.out.println("catch");
	// return;
	// } finally {
	// System.out.println("finally");
	// }
	// }

	// public static void main(String args[]) {
	// System.out.println(m1());
	// }
	//
	// static public int m1() {
	// try {
	// return 777;
	// } catch (NullPointerException e) {
	// System.out.println("catch");
	// return 888;
	// } finally {
	// return 999;
	// }
	// }

	
	
	
//	public static void main(String args[]) {
//		try {
//			
//			
//			System.out.println("try");
//			
////			System.out.println(10/0);
//			
//			System.out.println("end");
////			Thread.sleep(1000);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("catch" );
//			return;
//		} catch (Error e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			System.out.println("finally");
//		}
//		
//	}

	
	
//	  	static Exception e = new FileNotFoundException();
//		static ArithmeticException e=null;
//	  public static void main(String Args[]) throws Exception 
//	  {
//	    throw e;
//	  }
	
	  
//	  public static void main(String args[])
//	  {
//	    throw new ArithmeticException("/by Zero");
////	    System.out.println("Hello");
//	  }
//  
	  
	  

//	  public static void main(String args[])
//	  {
////	    throw new TestExp5();  
////		  throw new Exception();    //checked Excepytion 
////		  throw new ArithmeticException(); // un checked exception (Sub class of RuntimeException)
////		  throw new Error();			// un checked exception
//		  
////		  String S = new String("ABC");
////		  Object O = (Object)S;
////		  
////		  System.out.println();
////		  
//		  Object O = new Object();
//	      String S = (String) O;
//
//
//	  }

	  
	  
//	 public static void main(String args[])
//	  {
//	    PrintWriter pw = null;
//		try {
//			pw = new PrintWriter("abc.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    pw.println("Hello");
//	  }

	  
	 
//	  public static void main(String args[])
//	  {
//	   try {
//		Thread.sleep(10000);
//		System.out.println("Hello");
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  }


//}
