package langfunda;


import java.lang.*;

import oops.OverrideTest2;
public class ArrayExample
{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		OverrideTest2 oc= new OverrideTest2();
		
//		int[] a; //Declaration 
//		a=new int[3];  //creation of single D array 
		
//		int a=100;
		
		
		
//		int a1=100;
//		int a2=101;
//		int a3=101;
//		int a4=101;
//		
		
		
		int a[] = new int[5];
		
		a[0]=100;
		a[1]=101;
		a[2]=102;
		a[3]=109;
		a[4]=110;
		a[5]=111;
		
		
		System.out.println(a[0] + "  " + a[1]);
		System.out.println(a.length);
		
		
		int[][] x= new int[2][];
		
		x[0]=new int[3];
		x[1]=new int[2];
//		x[2]= new int[1];
		
////		
////		
		x[0][0]=5;
		x[0][1]=6;
		x[0][2]=7;
//		x[0][3]=8;
//		
		System.out.println(x[0][0] + "   " + x[0][1]);
////		
		x[1][0]=10;
		x[1][1]=20;
//		x[1][2]=10;
//		
//		
		int[][][] y= new int[2][][];
////		
		y[0]=new int [3][1];
		y[1]= new int [2][];
//		
//		
		y[0][0]=new int[2];
//		
		y[0][0][0]= 10;
////		
//		String s ="Srikanth";
//		System.out.println(s.length());
//		
//		
////		
////		
		
		y[0][1]=new int[1];
		y[0][2]=new int [5];
////		
//		y[1]=new int [2][2];
//		
		System.out.println("Array creation : " + y[0][0][0]);
//		
		System.out.println(y.getClass().getName());
//
	}
		
}