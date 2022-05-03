class ass2
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Addition is: "+(a+b));
		System.out.println("Substration is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		double c=(((double)a)/((double)b));
		System.out.println("Division is: "+c);
	}
}
