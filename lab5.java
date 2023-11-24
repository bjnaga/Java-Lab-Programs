/* write a java program that creates 3 threads :first thread " good morning", every one second 
 *  second thread " hello" every 2 seconds, third thread "welcome" every 3 seconds .*/
class Goodmorning extends Thread
{
	public void run()
	{
		try
		{
			int i=0;
			while(true)
			{
				sleep(1000);
				System.out.println("GOOD MORNING");
			}
		}
		catch(Exception e)
		{}
	}
	
}

class Hello extends Thread
{
	public void run()
	{
		try
		{
			int i=0;
			while(true)
			{
				sleep(2000);
				System.out.println("HELLO ");
			}
		}
		catch(Exception e)
		{}
	}
	
}
class Welcome extends Thread
{
	public void run()
	{
		try
		{
			int i=0;
			while(true)
			{
				sleep(3000);
				System.out.println(" WELCOME");
			}
		}
		catch(Exception e)
		{}
	}
	
}
public class Multithread {

	public static void main(String[] args) {
		Goodmorning t1=new Goodmorning();
		Hello t2=new Hello();
		Welcome t3=new Welcome();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
