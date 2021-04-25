package collections;

import java.util.TreeMap;

public class NavigableMapDemo {
 public static void main(String args[]){
	 TreeMap<String, String> t = new TreeMap<String, String>();
	 
	 t.put("b","bannana");
	 t.put("c","cat");
	 t.put("a","apple");
	 t.put("g","gun");
	 t.put("d","dog");

	 
	 System.out.println(t.ceilingKey("C"));
	 System.out.println(t.higherKey("e"));
	 System.out.println(t.floorKey("e"));
	 System.out.println(t.lowerKey("e"));
	 System.out.println(t.pollFirstEntry());
	 System.out.println(t.pollLastEntry());
	 System.out.println(t.descendingMap());
	 System.out.println(t);
	 

 }
}
