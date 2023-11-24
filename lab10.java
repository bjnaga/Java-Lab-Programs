/* write a small program to catch negative array size exception this exception
  is caused when the array is initialized to negative array */

public class NegativeSizeArray {

	public static void main(String[] args) {
		try
		{
			int i[]=new int[-1];
		}
		catch(NegativeArraySizeException e)
		{
			
			System.out.println("inside catch block exception caught"+e.getMessage());
		}

	}

}
