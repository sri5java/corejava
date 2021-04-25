package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
	public static void main(String args[]){
		
		LinkedList al= new LinkedList();
		
		for (int i=0; i<=20; i++){
			al.add(i);
		}
		System.out.println(al);
		
		Iterator itr= al.iterator();
		
		while(itr.hasNext()){
			Integer I = (Integer)itr.next();
			
//			System.out.println(I);
			
			if(I%5==0){
				System.out.println(I);
			}
			else {
				itr.remove();
			}
			
			
		}
		System.out.println(al);
	}
}
