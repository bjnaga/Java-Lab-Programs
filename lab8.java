//write a program to create user define exception say pay out of bounds.

import java.util.Scanner;

class PayOutOfBoundsEx extends Exception
{
	public PayOutOfBoundsEx(String s)
	{
		super(s);
	}
}

public class UdException {

	public static void main(String[] args) {
		int sal;
		try
		{
			System.out.println("enter salary:");
			Scanner in=new Scanner(System.in);
			sal=in.nextInt();
			if(sal>100000000)
			{
				throw new PayOutOfBoundsEx("PayOutOfBounds Exception");
				
			}
			
		}catch(PayOutOfBoundsEx ex)
		{
			System.out.println("salary can'tbe more then ten lakhs " +ex.getMessage());
		}

	}

}
