import java.util.Scanner;
class divide
{
	private String str;
	public divide(String s)
	{
		str=s;
	}
	void div()
	{
		int v=0;
		int str_size=str.length();
		for(int i=2;i<str_size;i++)
		{
			if(str_size%i!=0)
				v=0;
			else
			{
				v=1;
				break;
			}
		}
		if(v>0)
		{
			System.out.print("String can be divided into equals parts by: ");
			for(int i=2;i<str_size;i++)
			{
				if(str_size%i==0)
					System.out.print(i+", ");
			}
			Scanner sc=new Scanner(System.in);
			System.out.println();
			System.out.print("Enter the no of terms in which you would like to divide the string: ");
			int n=sc.nextInt();
			int part_size;
			part_size=str_size/n;
			System.out.println("String in equal parts is:");
			for (int i=0;i<str_size;i++) 
			{
				if(i<part_size)
					System.out.print(str.charAt(i));
				else
				{
					if ((i%part_size)==0)
						System.out.println();
					System.out.print(str.charAt(i));
				}
            
			}
		}
		else
			System.out.println("String cannot be divided.");
	}
}
class prog7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String k=sc.nextLine();
		divide dv=new divide(k);
		dv.div();
	}
}