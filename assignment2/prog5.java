import java.util.*;
class bank
{
	private float ori;
	bank(float a)
	{
		ori=a;
	}
	void withdraw(float b)
	{
		float x=b;
		if(x>ori)
			System.out.println("Less amount of balance is present.");
		else
		{
			System.out.println("Amount withdrawn successfully...");
			ori-=x;
		}
	}
	void deposit(float b)
	{
		float x=b;
		System.out.println("Amount deposited successfully...");
		ori+=x;
	}
	void check_bal()
	{
		System.out.println("Available amount in the bank: "+ori);
	}
}
class prog5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the current amount in your account: ");
		float y=sc.nextFloat();
		bank bk=new bank(y);
		System.out.println("Enter 1 to deposit.");
		System.out.println("Enter 2 to withdraw.");
		System.out.println("Enter 3 to check the balance.");
		System.out.println("Enter 4 to exit.");
		int p;
		float q;
		while(true)
		{
			System.out.print("Enter your choice: ");
			p=sc.nextInt();
			switch(p)
			{
				case 1:
				System.out.print("Enter the amount to be deposit: ");
				q=sc.nextFloat();
				bk.deposit(q);
				break;
				case 2:
				System.out.print("Enter the amount to be withdrawn: ");
				q=sc.nextFloat();
				bk.withdraw(q);
				break;
				case 3:
				bk.check_bal();
				break;
				default:
				System.exit(0);
			}
		}
	}
}