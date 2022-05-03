import java.util.Scanner;
class bank
{
	float amt;
	public bank(float bk)
	{
		amt=bk;
	}
}
class checking extends bank
{
	private float a;
	public checking(float bk)
	{
		super(bk);
	}
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount: ");
		float a=sc.nextFloat();
		if(a>amt)
		System.out.println("Less amount of balance is present.");
		else
		{
			System.out.println("Amount withdrawn successfully...");
			amt=amt-a;
		}
	}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount: ");
		float a=sc.nextFloat();
		System.out.println("Amount deposited successfully...");
		amt=amt+a;
	}
	float balance()
	{
		return amt;
	}
	
}
class prog7
{
	public static void main(String args[])
	{
		int i=1,x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the account balance: ");
		float acc=sc.nextFloat();
		checking bk=new checking(acc);
		System.out.println("Enter 1 to withdraw.");
		System.out.println("Enter 2 to deposit");
		System.out.println("Enter 3 to check account balance");
		System.out.println("Enter 4 to quit.");
		while(i==1)
		{
			System.out.print("Enter your choice: ");
			x=sc.nextInt();
			switch(x)
			{
				case 1:
				bk.withdraw();
				break;
				case 2:
				bk.deposit();
				break;
				case 3:
				System.out.println("Available amount in the bank is: "+String.format("%.2f",bk.balance()));
				break;
				default:
				i=0;
				break;
			}
		}
	}
}