import java.util.Scanner;
class exception_handling
{
	void calculate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int p=sc.nextInt();
		int arr[]=new int[p];
		System.out.println("Enter the numbers: ");
		try
		{
			for(int i=0;i<p;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]<0)throw new NegativeSizeException();
			}
		}
		catch(NegativeSizeException et)
		{
			System.out.println(et.getMessage());
		}
	}
	static class NegativeSizeException extends Exception
	{
		public NegativeSizeException()
		{
			super("Exception caught...\nArray value cannot be negative.");
		}
	}
}
class prog3
{
	public static void main(String args[])
	{
		exception_handling ex=new exception_handling();
		ex.calculate();
	}
}