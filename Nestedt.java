package ExceptionHandling;

public class Nestedt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=4;
    int b=0;
    try{
    	if(a%b==0)
    	{
    		try{
            	if(b%a==0)
            		System.out.println("Done");
    		}catch(ArithmeticException ae){
    			System.out.println("ArithmeticException");
    	}catch(Exception e){
    		try{
    			
    				System.out.println("Done");
    			}
    		catch(Exception ee){
    			
    		}
    	}
    	}
    	}catch(Exception eee){
     System.out.println("NullpointerException");	
    }
    finally{
    	try{
    		
    	}catch(Exception e){
    		
    	}
    }
	}

}
