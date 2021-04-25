package multithreading;

public class SleepDemo2 extends Thread {
	public void run(){
		for(int i=0;i<=50 ;i++){
			System.out.println("t1 : " +i);
		}
		System.out.println("End of t1 ");
	}
	
	public static void main(String args[]){
		
		SleepDemo2 s2=new SleepDemo2();
		
		s2.start();
		
		try{
			Thread.sleep(5000);
			
		}catch(Exception e){
			System.out.println(e);
		}
		for(int i=100; i<=150; i++){
			System.out.println("main : " +i);
		}
			System.out.println("end of main()");
	}
}
