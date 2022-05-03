class ass5
{
	public  static void main(String args[])
	{
		int a,fact=1;
		a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++)
		fact*=i;
		System.out.println("Factorial of the number "+a+" is: "+fact);
	}
}
