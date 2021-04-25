package collections;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String args[]){
		Hashtable h = new Hashtable();
		h.put(new Temp1(6), "Abcd");
		h.put(new Temp1(2), "Bat");
		h.put(new Temp1(6), "Cat");
		h.put(new Temp1(15), "D");
		h.put(new Temp1(23), "E");
		h.put(new Temp1(16), "F");
		h.put(new Temp1(100), "H");
//		h.put("Sri", null);
		
		System.out.println(h);
		
		
		
	}
}


class Temp1 {
	int i;
	Temp1(int i){
			this.i=i;
	}
	
	public int hashCode(){
		return i;
	}
	
	public String toString(){
		return i + "";
	}
}