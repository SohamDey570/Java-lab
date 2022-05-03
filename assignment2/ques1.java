class ques1
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		qp q=new qp(a);
		q.fact();
	}
}
class qp
{
	private int a,count=0;
	public qp(int x)
	{
		a=x;
	}
	void fact()
	{
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				count++;
		}
		if(count==2)
			System.out.println("It is a prime number.");
		else
			System.out.println("It is not a prime number.");
	}
}
