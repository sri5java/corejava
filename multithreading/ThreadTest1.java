package multithreading;



class Thread2 extends Thread {
	public void run()
	{
		System.out.println("Begining of t2:");
		for(int i=100;i<150;i++)
		{
			System.out.println("t2 : " +i);
		}
		System.out.println("End of t2" );
	}
}

class Thread3 extends Thread {
	public void run()
	{
		System.out.println("Begining of t3:");
		for(int i=200;i<150;i++)
		{
			System.out.println("t3 : " +i);
		}
		System.out.println("End of t3" );
	}
}

class ThreadTest1 {
	public static void main(String args[]){
//	Thread t1= new Thread1();
	Thread t2= new Thread2();
	Thread t3= new Thread3();
	
//	t1.start();
	t2.start();
	t3.start();
	
	for(int i=300 ; i<=350 ;i++){
		System.out.println("main "+i);
	}
	
	System.out.println("End of main");
}
}
