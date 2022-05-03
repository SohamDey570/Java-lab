import java.util.Scanner;
class concate1
{
	private String str1,str2;
	public concate1(String st1,String st2)
	{
		str1=st1;
		str2=st2;
	}
	void conca()
	{
		String st="";
		st=str1.concat(str2);
		System.out.println("Concatenated string is: "+st);
	}
}
class prog10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter thye first string: ");
		String p=sc.nextLine();
		System.out.print("Enter thye second string: ");
		String q=sc.nextLine();
		concate1 ct=new concate1(p,q);
		ct.conca();
	}
}