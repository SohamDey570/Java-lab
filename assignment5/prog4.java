import java.util.Scanner;
class frequency
{
	private String str;
	public frequency(String s)
	{
		str=s;
	}
	void calculate()
	{
		int j,freq=1;
		char arr[]=new char[str.length()];
		System.out.println("Frequency of characters is:");
		for(int i=0;i<str.length();i++)
			arr[i]=str.charAt(i);
		for(int i=0;i<str.length();i++)
		{
			freq=1;
			for(j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					freq++;
					arr[j]='0';
				}
			}
			if(arr[i]!=' '&&arr[i]!='0')  
				System.out.println(arr[i]+" is present: "+freq+" times.");
		}
	}
}
class prog4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String st=sc.nextLine();
		frequency fq=new frequency(st);
		fq.calculate();
	}
}