package logicalprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		int i=0;
		int count =10;
		
		
		System.out.println(n1+" "+n2);
		
		for(i=2;i<count;++i){
			n3= n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}

	}

}
