import java.util.Scanner;
abstract class employee
{
	abstract void net_sal();
	abstract void display();
}
class manager extends employee
{
	private double sal;
	void net_sal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the salary: ");
		sal=sc.nextDouble();
	}
	void display()
	{
		System.out.println("The manager's salary is: "+sal);
	}
}
class clerk extends employee
{
	private double sal;
	void net_sal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the salary: ");
		sal=sc.nextDouble();
	}
	void display()
	{
		System.out.println("The clerk's salary is: "+sal);
	}
}
class prog2
{
	public static void main(String args[])
	{
		employee mg=new manager();
		mg.net_sal();
		mg.display();
		employee ck=new clerk();
		ck.net_sal();
		ck.display();
	}
}