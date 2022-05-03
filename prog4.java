import java.util.Scanner;
class SI
{
	private double principal;
	private float rate,time;
	public SI(double a,float b,float c)
	{
		principal=a;
		rate=b;
		time=c;
	}
	void calculate()
	{
		double inte;
		inte=(principal*rate*time)/100;
		System.out.println("Interest is: "+inte);
		System.out.println("Total amount after interest: "+(inte+principal));
	}
}
class prog4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p;
		float r,t;
		System.out.print("Enter the principal amount: ");
		p=sc.nextDouble();
		System.out.print("Enter the rate: ");
		r=sc.nextFloat();
		System.out.print("Enter the time in years: ");
		t=sc.nextFloat();
		SI si=new SI(p,r,t);
		si.calculate();
	}
}