import java.util.Scanner;
class reverse
{
	private String arr3[];
	private int p;
	public reverse(String ar[],int x)
	{
		arr3=new String[x];
		arr3=ar;
		p=x;
	}
	void rev()
	{
		System.out.println("Reversed String array is: ");
		for(int i=p-1;i>=0;i--)
			System.out.println(arr3[i]);
	}
}
class prog9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int a=sc.nextInt();
		String arr1[] =new String[a];
		System.out.println("Enter the strings: ");
		for(int i=0;i<a;i++)
			arr1[i]=sc.next();
		reverse rv=new reverse(arr1,a);
		rv.rev();
	}
}