// write a program to implement method overriding.

class DemoToString
{
	int a,b;
	public DemoToString()
	{
		a=10;
		b=20;	
	}
	public String toString()
	{
		return("\n value of a=" +a+"\nvalue of b="+b);
	}
	
}

public class Overriding {

	public static void main(String[] args) 
	{
		System.out.println("the content of the obj is"+new DemoToString());

	}

}
