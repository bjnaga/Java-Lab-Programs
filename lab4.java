/*Write a program to demonstrate the properties of dynamic binding by creating a three classes 
 * grandfather, father, child where father inherits the properties of grandfather and child inherits
 *  the properties of father. Create a function named display in all the three classes and perform 
 *  appropriate operations to incorporate dynamic binding into program.
 */

class Grandfather
{
	public void display1()
	{
		System.out.println("public grandfather");
	}
	
	protected void display3()
	{
		System.out.println("protected grandfather");
	}
}
class Father extends Grandfather
{
	public void display1()
	{
		System.out.println("public father");
	}
	
	protected void display3()
	{
		System.out.println("protected father");
	}
}
class Child extends Father
{
	public void display1()
	{
		System.out.println("public child");
	}
	
	protected void display3()
	{
		System.out.println("protected child");
	}
}

public class DynamicBinding {
	public static void main(String [] args)
	{
		
		Grandfather GF=new Father();
		Father F=new Child();
		GF.display1();
		F.display3();
	}

}
