/* write a program to handle NullPointer exception and 
use the "finally" method to display a message*/

public class NullPointer {

	public static void main(String[] args) {
		try
		{
			String a=null;
			System.out.println(a.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("exception caught inside catch block" +e.getMessage());
		}
		finally
		{
			System.out.println(" inside fianlly bloch all exceptions are cleared");
		}

	}

}
