package multithreading;

public class Thread1 implements Runnable {
	
	public void run(){
		System.out.println("Beginig of t1");
		for(int i=0; i<=10; i++){
			System.out.println("t1 : " +i);
		}
		System.out.println("End of t1");
	}
	
//	public void run(int j){
//		System.out.println("Beginig of overloaded run method");
//		for(int i=0; i<=10; i++){
//			System.out.println("t1 : " +i);
//		}
//		System.out.println("End of t1");
//		
//	}
	
	public static void main(String args[]){
		Thread1 t1=new Thread1();
		Thread t2 = new Thread(t1);
		
//		t1.run(10);
		t2.start();    //--> to hand over the run() of Runnable i/f to the JVM for scheduling(output of any thread application depends upon scheduling)
		
		for(int i=0; i<=10 ; i++){
			System.out.println("main : " +i);
		}
		System.out.println("End of main");
	}

	
}
