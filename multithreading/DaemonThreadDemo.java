package multithreading;


class MyThread5 implements Runnable{
	public void run(){
		for(int i=1; i<10; i++){
			System.out.println("Lazy Thread");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class MyThread6 implements Runnable{
	public void run(){
		for(int i=1; i<10; i++){
			System.out.println("fast Thread");
			try{
				
				if(i==5){
					
				}
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}


public class DaemonThreadDemo {
	public static void main(String args[]){
		
		MyThread5 m= new MyThread5();
		Thread t1= new Thread(m);
		
		t1.setDaemon(true); // --> 1 
		
		System.out.println(t1.isDaemon());
		t1.start();
		
		System.out.println("End of main : ");
		
		
		
		}
}
