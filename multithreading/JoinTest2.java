package multithreading;
//
class Jthread4 implements Runnable{
	int sum=0;
	
	public void run(){
		System.out.println("begining of t1 :" );
		
		for(int i=0; i<=50; i++){
			sum = sum +i;
			System.out.println("t1 :" +i);
		}
		System.out.println("end of t1");
	}
}
//
//class Jthread5 extends Thread{
//	int sum=0;
//	
//	public void run(){
//		System.out.println("begining of t2 :" );
//		
//		for(int i=100; i<=150; i++){
//			sum = sum +i;
//			System.out.println("t2 :" +i);
//		}
//		System.out.println("end of t2");
//	}
//}
//
//class Jthread6 implements Runnable{
//	Jthread4 t4;
//	Thread t6 = new Thread(t4);
//	Jthread6 (Jthread4 t4){
//		this.t4=t4;
//	}
//	
//}
//	
//	public void run(){
//		System.out.println("begining of t3");
//		
//		for(int i=200; i<=250; i++){
//			System.out.println("t3 : " +i );
//			if(i==215){
//				try{
//					t4.join();
//				}catch(Exception e){
//					System.out.println(e);
//				}
//				System.out.println("Sum of 50 " +t4.sum);
//			}
//		}
//		System.out.println("End of T3");
//	}
//	
//}
//
//
class JoinTest2{
	public static void main(String args[]) throws InterruptedException{
		
		
		Jthread4 t4= new Jthread4();
		Thread t1= new Thread(t4);
		
		
//		Jthread5 t5= new Jthread5();
//		Thread t2= new Thread(t5);
//		
//		
//		Jthread6 t6= new Jthread6(t4);
//		Thread t3= new Thread(t6);
		
		t1.start();
		
//		t2.sleep(10000);
//		t3.start();
//		t2.start();
		
		
		
	}
}
//
//
//
