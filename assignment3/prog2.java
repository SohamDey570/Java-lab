import java.util.*;
class Area
{
	private float h,r;
	Area(float a,float b)
	{
		h=a;
		r=b;
	}
	void calculate()
	{
		double ar=0,sr=0;
		ar=2*3.14*r*(r+h);
		sr=2*3.14*r*h;
		System.out.println("Surface arrea of the cylinder is: "+sr+" sq. units");
		System.out.println("Total Surface arrea of the cylinder is: "+ar+" sq. units");
	}
}
class prog2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height of the cylinder: ");
		float p=sc.nextFloat();
		System.out.print("Enter the radius of the cylinder: ");
		float q=sc.nextFloat();
		Area ar=new Area(p,q);
		ar.calculate();
	}
}