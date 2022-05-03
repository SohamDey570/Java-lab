import java.util.Scanner;
class Split
{
	private String str;
	public Split(String s)
	{
		str=s;
	}
	void calculate()
	{
		String[] st=str.split(" ",0);
		System.out.println("Splited string is:");
		for(int i=0;i<st.length;i++)
			System.out.println(st[i]);
	}
}
class prog3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1=sc.nextLine();
		Split sp=new Split(s1);
		sp.calculate();
	}
}