package langfunda;

public class VarArgsExample1 {

	public static void sum(int ...x){
		System.out.println("var- arg method");
		
		int total=0;
		for(int x1 : x){
			total=total + x1;
		}
		
		VarArgsExample1 v1= new VarArgsExample1();
		
		System.out.println("the total is :"  + total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sum();
			sum(10);
			sum(10, 20);
			sum(10, 20, 30, 40);
			
	}

}
