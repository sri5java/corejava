package declarationsandaccessmodifiers;

import java.util.ArrayList;
import java.util.List;

public class TestAutoBoxUnBox {
	public static void main(String args[]){
		
//		List<Integer> li = new ArrayList<>();
//		
////		Integer i1= new Integer(10); // until 1.4 
////		li.add(i1);
//		
//		//autoboxing
//		for (int i = 1; i < 50; i += 2)
//		    li.add(i); //           li.add(Integer.valueOf(i)); Internally Autoboxing concept implemented by using valueOf() method
////		
////		System.out.println(li);
		
		Sri s1 = new Sri();
		s1.test1();
		
		
		//unboxing
		Integer i2 = new Integer(20);
		int j= i2;						//int j = i2.intValue(); 
		
		System.out.println(j); 

	}
}
