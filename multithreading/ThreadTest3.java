package multithreading;

//If we are not overriding run() method 

class MyThread1 extends Thread{

//	public void start(){
//		System.out.println("start method");
//	}
	
	public void run(){
		System.out.println("run method");
	}
}

public class ThreadTest3 {
	public static void main(String args[]){
		MyThread1 t3 = new MyThread1();
		t3.start();
		
	}
}
