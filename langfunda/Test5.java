package langfunda;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 l1= new Test5();
		l1.foo(false,true);
	}
	
	public void foo( boolean a, boolean b)
	{ 
	    if( a ) 
	    {
	        System.out.println("A"); /* Line 5 */
	    } 
	    else if(a && b) /* Line 7 */
	    { 
	        System.out.println( "A && B"); 
	    } 
	    else /* Line 11 */
	    { 
	        if ( !b ) 
	        {
	            System.out.println( "notB") ;
	        } 
	        else 
	        {
	            System.out.println( "ELSE" ) ; 
	        } 
	    } 
	}

}
