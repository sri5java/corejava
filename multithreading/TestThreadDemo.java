package multithreading;

 class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<1; i++){
			System.out.println("Child Thread");
		}
	}

}

class TestThreadDemo{
	public static void main(String args[]){
		
		MyRunnable r=new MyRunnable();
		Thread t = new Thread(r);
//		Thread t2 = new Thread(r);
		
		
		t.start();
		t.setPriority(10);
		
		Thread.yield();
//		Thread.yield();
		
//		t.setDaemon(true);
		
		t.isDaemon(); //boolean
		
		System.out.println(t.getPriority());
		
	
//		t.setPriority(10);
		
		System.out.println(Thread.currentThread().getName());// main
		Thread.currentThread().setName("Srikanth");
		System.out.println(Thread.currentThread().getName()); //srikanth
		
		
		
		
		for(int i=0; i<1; i++){
			System.out.println("mainThread");
		}
	}
}
