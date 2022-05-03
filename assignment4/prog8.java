import java.util.Scanner;
class pass
{
	private int arr3[],p;
	public pass(int ar[],int x)
	{
		arr3=new int[x];
		arr3=ar;
		p=x;
	}
	void calculate()
	{
		String arr2[]=new String[p];
		for(int i=0;i<p;i++)
			arr2[i]=String.valueOf(arr3[i]);
		System.out.println("Numbers are:");
		for(int i=0;i<p;i++)
			System.out.print(arr2[i]+" ");
	}
}
class prog8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int a=sc.nextInt();
		int arr1[] =new int[a];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<a;i++)
			arr1[i]=sc.nextInt();
		pass ps=new pass(arr1,a);
		ps.calculate();
	}
}