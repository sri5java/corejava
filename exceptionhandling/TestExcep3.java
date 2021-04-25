package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExcep3 {
	public static void main(String args[]) {
		System.out.println("In main ");
		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();

	}

	public static void doMoreStuff() {
//		FileInputStream fis = null;
//		try {
			
//			fis = new FileInputStream("D://abc.txt"); //stmt1
			
			System.out.println("Hi All");
			
			try{
				System.out.println(10 / 0);
			}catch(Exception e){
				e.printStackTrace();
				
//				try{
//				System.out.println(10 / 0);
//				}catch(Exception e1){
//					
//				}
			}
				
			
	
			System.out.println("Heloo ");
		
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//			
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		System.out.println("Hi More stuff");

	}
}
