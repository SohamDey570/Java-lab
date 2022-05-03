import java.util.Scanner;
class ass4
{
	public static int acc;
	public static void main(String args[])
	{
		int i=1,x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the account balance: ");
		acc=sc.nextInt();
		withdraw a= new withdraw();
		diposit b= new diposit();
		balance c= new balance();
		System.out.println("Enter 1 to withdraw.");
		System.out.println("Enter 2 to deposit");
		System.out.println("Enter 3 to check account balance");
		System.out.println("Enter 4 to quit.");
		while(i==1){
		System.out.print("Enter your choice: ");
		x=sc.nextInt();
		switch(x)
		{
			case 1:
			a.withdraw_method();
			break;
			case 2:
			b.diposit_method();
			break;
			case 3:
			c.balance_method();
			break;
			default:
			i=0;
			break;
		}
		}
	}
}
class withdraw
{
	private int e;
	void withdraw_method()
	{
		ass4 abc=new ass4();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount: ");
		e=sc.nextInt();
		if(e>abc.acc)
		System.out.println("Less amount of balaance is present.");
		else
		{
			System.out.println("Amount withdrawn successfully...");
			abc.acc=abc.acc-e;
		}
	}
}
class diposit
{
	private int e;
	void diposit_method()
	{
		ass4 abc=new ass4();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount: ");
		e=sc.nextInt();
		System.out.println("Amount deposited successfully...");
		abc.acc=abc.acc+e;
	}
}
class balance
{
	void balance_method()
	{
		ass4 abc=new ass4();
		System.out.println("Avalaible amount in bank account: "+abc.acc);
	}
}
