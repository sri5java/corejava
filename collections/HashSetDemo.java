package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String args[]){
		
//		TreeSet h = new TreeSet();
//		HashSet h = new HashSet<>();
		LinkedHashSet h = new LinkedHashSet();
		
		h.add("B");
		h.add("D");
		h.add("c");
		h.add("Z");
		
		h.add(null);
		h.add(10);
		h.add("s");
		
		h.add("Z");
		
		 
		System.out.println(h.add("Z")); // false 
		System.out.println(h.add("K"));
//		System.out.println("Z");
		
		System.out.println(h);
		
		
		
	}
}
