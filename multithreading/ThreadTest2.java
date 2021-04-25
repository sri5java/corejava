package multithreading;

//overloading of run() method 
class MyThread extends Thread{
	public void run()  // Ready /Runnable
	{
		System.out.println("no arg");
	}
	
	//3) After run() will completes then will go to dead state
	
	public void run(char i){
		System.out.println("int arg");
	}
	
	
}

public class ThreadTest2 {
	public static void main(String args[]){
		MyThread t2 = new MyThread(); // 1) Born state
		t2.start(); 
		t2.run('c');
	}
}
