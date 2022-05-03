import java.util.*;
class differ
{
	private int x;
	differ(int a)
	{
		x=a;
	}
	void difference()
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=x;i++)
		{
			sum1+=(i*i);
			sum2+=i;
		}
		sum2=sum2*sum2;
		System.out.println("Difference between the two sums is: "+(sum1-sum2));
	}
}
class prog1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Engter the number of terms: ");
		int p=sc.nextInt();
		differ df=new differ(p);
		df.difference();
	}
}
