import java.util.*;
class prog2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st;
		System.out.print("Enter a string: ");
		st=sc.next();
		ab z=new ab(st);
		z.pallin();
	}
}
class ab
{
	private String q,r="";
	public ab(String p)
	{
		q=p;
	}
	void pallin()
	{
		for(int i=0;i<q.length();i++)
			r=(q.charAt(i))+r;
		if(q.equalsIgnoreCase(r))
			System.out.println("It is palindrome.");
		else
			System.out.println("It is not palindrome.");
	}
}