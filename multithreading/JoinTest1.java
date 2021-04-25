package multithreading;

class Jthread1 extends Thread{
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

class Jthread2 extends Thread{
	int sum=0;
	
	public void run(){
		System.out.println("begining of t2 :" );
		
		for(int i=100; i<=150; i++){
			sum = sum +i;
			System.out.println("t2 :" +i);
		}
		System.out.println("end of t2");
	}
}

class Jthread3 extends Thread{
	Jthread1 t1;
	Jthread3 (Jthread1 t1){
		this.t1=t1;
	}
	
	public void run(){
		System.out.println("begining of t3");
		
		for(int i=200; i<=250; i++){
			System.out.println("t3 : " +i );
			if(i==215){
				try{
					t1.join();
				}catch(Exception e){
					System.out.println(e);
				}
				System.out.println("Sum of 50 " +t1.sum);
			}
		}
		System.out.println("End of T3");
	}
	
}


class JoinTest1{
	public static void main(String args[]) throws InterruptedException{
		Jthread1 t1= new Jthread1();
		Jthread2 t2= new Jthread2();
		Jthread3 t3= new Jthread3(t1);
		
		t1.start();
		
//		t2.sleep(10000);
		t3.start();
//		t2.sleep(10000);
//		t2.start();
		
		
	}
}



