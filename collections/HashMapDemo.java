package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
//		HashMap<String, String> h = new HashMap<String, String>();
		LinkedHashMap<String, String> h = new LinkedHashMap<String, String>();
		
		h.put("Man", "Manisha");
		h.put("Jenny", "Janardhan");
		h.put("Su", "Sumanth");
		h.put("King", "Raju");
		
		System.out.println("Old value : " + h.put("Sri", "Srinath"));

		System.out.println(h);
		
		System.out.println(h.get("Jenny"));
		System.out.println(h.remove("King"));
		
		System.out.println(h);
		
		
		System.out.println(h.containsKey("hello"));
		System.out.println(h.containsValue("Srikanth"));
		
		System.out.println(h.isEmpty());
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());

	}

}
