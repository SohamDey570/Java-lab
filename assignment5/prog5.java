import java.util.Scanner;
class Box
{
	private float l,b,h;
	public Box(float length,float breadth,float height)
	{
		l=length;
		b=breadth;
		h=height;
	}
	float volume()
	{
		return (l*b*h);
	}
}
class prog5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length: ");
		float len=sc.nextFloat();
		System.out.print("Enter the breath: ");
		float bre=sc.nextFloat();
		System.out.print("Enter the height: ");
		float hei=sc.nextFloat();
		Box bx=new Box(len,bre,hei);
		System.out.println("Volume of the box is: "+String.format("%.2f", bx.volume()));
	}
}