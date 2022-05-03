import java.util.*;
class ass6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int a= sc.nextInt();
		fibo fi=new fibo();
		System.out.println("The fibonnacci series is:");
		fi.fibo_function(a);
	}
}
class fibo
{
	void fibo_function(int p)
	{
		int x=0,y=1,c=0;
		for(int i=1;i<=p;i++)
		{
			System.out.print(x+" ");
			c=x+y;
			x=y;
			y=c;
		}
		System.out.println("");
	}
}
