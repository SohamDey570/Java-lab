import java.util.*;
class adddistance
{
	private int e,f,g,h;
	public adddistance(int p,int q,int r,int s)
	{
		e=p;
		f=q;
		g=r;
		h=s;
	}
	void add()
	{
		int y,z;
		y=e+g;
		z=f+h;
		int m=z;
		if(z>=12)
		{
			z=z%12;
			y=y+(m/12);
		}
		System.out.println("Addition is: "+y+" feet "+z+" inch");
	}
}
class prog4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter the first distance:");
		System.out.print("Enter the feet: ");
		a=sc.nextInt();
		System.out.print("Enter the inch: ");
		b=sc.nextInt();
		
		if(b>=12)
			System.out.println("You cannot enter more than 12");
		else
		{
			System.out.println("Enter the second distance:");
			System.out.print("Enter the feet: ");
			c=sc.nextInt();
			System.out.print("Enter the inch: ");
			d=sc.nextInt();
			if(d>=12)
				System.out.println("You cannot enter more than 12");
			else
			{
				adddistance ad=new adddistance(a,b,c,d);
				ad.add();
			}
		}
	}
}