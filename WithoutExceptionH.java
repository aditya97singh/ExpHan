package ExceptionHandling;

public class WithoutExceptionH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=null;
		try{
			if(a.equals("Aditya"))
				System.out.println("Matched");
			else
				System.out.println("Not matched");
		}catch(NullPointerException e)
		{
			System.out.println("NullPointerException Occured");
		}
		finally{
			System.out.println("Closing block");
		}

	}

}
