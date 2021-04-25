package collections;

import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String args[]) {
		TreeSet<Integer> t = new TreeSet<Integer>();
//		TreeSet t = new TreeSet();
		
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		
		System.out.println(t.ceiling(2000)); // It returns lowest element which is >= t
		System.out.println(t.higher(2000)); //It returns lowest element which is > t
		System.out.println(t.floor(3000)); //It return highest element which is <= t
		System.out.println(t.lower(3000)); //It return highest element which is < e
		System.out.println(t.pollFirst()); // It returns and remove First Element 
		System.out.println(t.pollLast()); // It removes and returns last element 
		System.out.println(t.descendingSet()); // It returns Navigable set in reverse order
		System.out.println(t);
	}
}
