package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]){
		
		TreeSet<String> t = new TreeSet();
		System.out.println("Hello");
		
		t.add(new String("A"));
		t.add(new String("h"));
		t.add(new String("d"));
		t.add(new String("j"));
		t.add(new String("b"));
//		t.add(1);
		
		
		System.out.println(t);
		
	}
}


