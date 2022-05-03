class ass3
{
	public static void main(String args[])
	{
		int a,count=0;
		a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			count++;
		}
		if(count==2)
		System.out.println("It is a prime number");
		else
		System.out.println("It is not a prime number");
	}
}
