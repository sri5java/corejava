package oops;


class Base{
	/*1*/static int i =10;  //12
	
	/*2*/static {
		m1();    //13
		System.out.println("Base static Block");
	}
	
	/*3*/public static void main(String args[]){
		m1();  	//15
		System.out.println("Base Main");//16
	}
	
	/*4*/public static void m1(){
		System.out.println(j); //14
	}
	
	/*5*/static int j=20;  //20
}
