import java.util.Scanner;
class search
{
	private String str1,str2;
	public search(String s1,String s2)
	{
		str1=s1;
		str2=s2;
	}
	void search_ch()
	{
		int i=0;
		i=str1.lastIndexOf(str2);
		if(i>0)
		System.out.println("Last index of '"+str2+"' is: "+i);
		else
			System.out.println("The string doesnot contain the given string or word.");
	}
}
class prog5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String p=sc.nextLine();
		System.out.print("Enter the String to be searched: ");
		String q=sc.nextLine();
		search sh=new search(p,q);
		sh.search_ch();
	}
}