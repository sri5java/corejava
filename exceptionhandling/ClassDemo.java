package exceptionhandling;

import java.lang.*;

//import accessmodifiers.VarargExample2;

public class ClassDemo {

   public static void main(String[] args) {

     try {
        // returns the Class object for the class with the specified name
        Class cls = Class.forName("java.lang.ClassLoader");
         
//        VarargExample2 v = new VarargExample2();
        // returns the name and package of the class
        System.out.println("Class found = " + cls.getName());
        System.out.println("Package = " + cls.getPackage());
     }
     catch(ClassNotFoundException ex) {
        System.out.println(ex.toString());
     }
   }
}
