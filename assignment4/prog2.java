import java.util.Scanner;
class conversion
{
	private String str;
	public conversion(String s)
	{
		str=s;
	}
	void upper()
	{
		System.out.println("String in upper case is: "+str.toUpperCase());
	}
	void lower()
	{
		System.out.println("String in lower case is: "+str.toLowerCase());
	}
}
class prog2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st;
		System.out.print("Enter a string: ");
		st=sc.nextLine();
		conversion cr=new conversion(st);
		cr.upper();
		cr.lower();
	}
}