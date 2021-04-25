package declarationsandaccessmodifiers;

public class TestAutoBUnB {
		static Integer I =10; //Auto Boxing
		
		public static void main(String args[]){
			int i = I;
			m1(i);
		}
		
		public static void m1(Integer I){ // Auto Boxing 
			int k =I; 					//Auto Unboxing 
			System.out.println(k);
		}
}
