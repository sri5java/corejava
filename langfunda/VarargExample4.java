package langfunda;

public class VarargExample4 {

	
	public static void main(String... args){
		int[] a={10, 20, 30};
		int[] b= {40, 50};
		
		m1(a, b);
	}
	
	public static void m1(int[]... x){
		for(int[] x1: x){
			System.out.println(x1[0]);
		}
	}
}
