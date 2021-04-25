package declarationsandaccessmodifiers;



interface interf1{
	
	
	void m1();
	void m2();
	void m3();
}


abstract class Y implements interf1{
	@Override
	public void m1() {
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}



class A1  extends Y {
	 public static void main(String args[]){
		 System.out.println("A class main  " );
	 }
	 
	
	 public void m2(){
		 
	 }
}
    class Test extends A{
	 public static void main(String args[]){
		 System.out.println("B class main");
	 }
}


   class C {
	 public static void main(String args[]){
		 System.out.println("C class main");
	 }
}

class D1{
	 
}


