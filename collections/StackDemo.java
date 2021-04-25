package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[]){
		
		Stack s1= new Stack();
		
		s1.push("A");
		s1.push("B");
		s1.push("C");
		s1.push("D");
		
		System.out.println(s1);
		System.out.println(s1.search("D"));
		System.out.println(s1.search("z"));
		
		
	
		
	}
}
