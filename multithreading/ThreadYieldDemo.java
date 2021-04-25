package multithreading;

class MyThread3 extends Thread{
	public void run(){
		
		
		for (int i=0; i<10; i++){
			
			System.out.println("child thred");
			
		}
		Thread.yield();
	}
}

public class ThreadYieldDemo {
	public static void main(String args[]){
		MyThread3 t = new MyThread3();
		
		t.start();
		
		for(int i=0; i<200; i++){
			System.out.println("main method");
		}
	}
}
