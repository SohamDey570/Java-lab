class nthread implements Runnable
{
	Thread t;
	nthread()
	{
		t=new Thread(this,"Second Thread");
		t.start();
	}
	public void run()
	{
		try
		{
			System.out.println("This is child.");
			System.out.println("HI");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
class prog6
{
	public static void main(String args[])
	{
		new nthread();
		try
		{
			System.out.println("This is main.");
			System.out.println("Hello");
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Exiting main thread.");
	}
}