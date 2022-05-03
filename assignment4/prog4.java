import java.util.Scanner;
class equa
{
	private String str1,str2;
	public equa(String s1,String s2)
	{
		str1=s1;
		str2=s2;
	}
	void check()
	{
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Both the Strings contains same data.");
		else
			System.out.println("Both the Strings donot contains same data.");
	}
}
class prog4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String p=sc.nextLine();
		System.out.print("Enter the second string: ");
		String q=sc.nextLine();
		equa eq=new equa(p,q);
		eq.check();
	}
}