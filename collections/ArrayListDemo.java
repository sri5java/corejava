package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]){
		
//		List al= new ArrayList();
		ArrayList al= new ArrayList();
		
		al.add("Sri");
		al.add("Sri");
		al.add("AJ");
		al.add("ABC");
		al.add("AAAA");
		
		
		al.add('E');
		
//		al.add(0,"AAA");
//		al.add(1,"BBB");
		
		
		
		al.add(10);
		
		al.add(10.5);
		
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(3);
		System.out.println(al);
//		al.add(2,"M");
//		al.add("N");
//		System.out.println(al);
////		
//		System.out.println(al.indexOf("AAA"));
//		System.out.println(al.lastIndexOf("N"));
//		System.out.println(al.get(5));
//		al.set(5, "Sri");
////		
//		System.out.println(al);
////		
//		System.out.println(al.get(5));
//		
		
	}
}
