package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
//		HashMap<Integer, String> h = new HashMap<Integer, String>();
		IdentityHashMap<Integer, String> h = new IdentityHashMap<Integer, String>();
		@SuppressWarnings("deprecation")
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		h.put(i1, "Srikanth");
		h.put(i2, "Sumanth");
		
		System.out.println(h);
	}
}
