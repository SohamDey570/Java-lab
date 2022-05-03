import java.util.*;
class Area
{
	private double x,y;
	public Area(double a,double b)
	{
		x=a;
		y=b;
	}
	double returnArea()
	{
		return(x*y);
	}
}
class prog3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p,q;
		System.out.print("Enter the length of the rectangle: ");
		p=sc.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		q=sc.nextDouble();
		Area ar=new Area(p,q);
		double area=ar.returnArea();
		System.out.println("Area of the rectangle is: "+area+" units");
	}
}