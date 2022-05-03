import java.util.*;
class Area1
{
	private float l;
	Area1(float a)
	{
		l=a;
	}
	void calculate()
	{
		double side=Math.sqrt(l);
		double pr=4*side;
		System.out.println("Perimeter of the square is: "+String.format("%.2f",pr)+" units");
	}
}
class prog3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the area of the square: ");
		float x=sc.nextFloat();
		Area1 ar=new Area1(x);
		ar.calculate();
	}
}