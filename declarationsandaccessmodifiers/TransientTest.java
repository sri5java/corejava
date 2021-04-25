package declarationsandaccessmodifiers;


import java.io.Serializable;  
public class TransientTest implements Serializable{  
 int id;  
 String name;  
 transient int age;//Now it will not be serialized  
 public TransientTest(int id, String name,int age) {  
  this.id = id;  
  this.name = name;  
  this.age=age;  
//  System.out.println(id +"  "+ name +"  " + age);
 } 
 
 public static void main (String args[]){
	 
 }
} 