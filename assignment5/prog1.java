import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	public Person(String n,int a)
	{
		name=n;
		age=a;
	}
	void display1()
	{
		System.out.println("Person's name is: "+name);
		System.out.println("Person's age is: "+age);
	}
}
class politician extends Person
{
	private int sal1;
	public politician(String n,int a,int s)
	{
		super(n,a);
		sal1=s;
	}
	void display2()
	{
		System.out.println("The person is a politician and the salary of the person is: "+sal1);
	}
}
class sportsman extends Person
{
	private int sal2;
	public sportsman(String n,int a,int s)
	{
		super(n,a);
		sal2=s;
	}
	void display3()
	{
		System.out.println("The person is a sportsman and the salary of the person is: "+sal2);
	}
}
class prog1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String x;
		int y,z;
		System.out.println("Enter 1 to print the details of a politician.");
		System.out.println("Enter 2 to print the details of a sportsman.");
		System.out.println("Enter 3 to exit.");
		System.out.print("Enter your choice: ");
		int p=sc.nextInt();
		sc.nextLine();
		switch(p)
		{
			case 1:
			System.out.print("Enter the name of the person: ");
			x=sc.nextLine();
			System.out.print("Enter the age of the person: ");
			y=sc.nextInt();
			System.out.print("Enter the salary: ");
			z=sc.nextInt();
			politician pg=new politician(x,y,z);
			System.out.println("");
			pg.display1();
			pg.display2();
			break;
			case 2:
			System.out.print("Enter the name of the person: ");
			x=sc.nextLine();
			System.out.print("Enter the age of the person: ");
			y=sc.nextInt();
			System.out.print("Enter the salary: ");
			z=sc.nextInt();
			sportsman st=new sportsman(x,y,z);
			System.out.println("");
			st.display1();
			st.display3();
			break;
			default:
			System.exit(0);
		}
	}
}
