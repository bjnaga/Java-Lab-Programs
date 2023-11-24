// write a program to demonstrate vector and its methods.

import java.util.Scanner;
import java.util.Vector;

public class DemoVectors {
	public static void main(String[]args)
	{
		Vector<Integer>vobj=new Vector<Integer>();
		Scanner obj=new Scanner(System.in);
		System.out.println("enter atlest 5 elements:");
		for(int i=1;i<=5;i++)
			vobj.add(obj.nextInt());
		System.out.println(vobj);
		vobj.remove(2);
		System.out.println(vobj);
		vobj.add(3, 10);
		System.out.println(vobj);
		System.out.println(" the forth element of array"+vobj.get(4)+" ");
		System.out.println(" size of array"+vobj.size()+" ");
		for(int i=0;i<vobj.size();i++)
			System.out.println(vobj.get(i)+"");
		vobj.clear();
		System.out.println(" vobj after clearing the array"+vobj);

		}
}
