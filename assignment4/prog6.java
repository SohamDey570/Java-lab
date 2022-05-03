import java.util.Scanner;
class remove
{
	private String str;
	public remove(String s)
	{
		str=s;
	}
	void remove_space()
	{
		System.out.println("String after triming of white spaces is: "+str.trim());
	}
}
class prog6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String st=sc.nextLine();
		remove rv= new remove(st);
		rv.remove_space();
	}
}