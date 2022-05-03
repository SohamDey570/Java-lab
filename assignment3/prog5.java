import java.util.Scanner;
class Employee
{
	private double net_sal,tax;
	private char gr;
	public Employee(double s,double t,char g)
	{
		net_sal=s;
		tax=t;
		gr=g;
	}
	double netsalary()
	{
		return(net_sal-tax);
	}
	char grade()
	{
		return gr;
	}
}
class prog5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double x,y;
		char z;
		System.out.print("Enter the salary: ");
		x=sc.nextDouble();
		System.out.print("Enter the tax: ");
		y=sc.nextDouble();
		System.out.print("Enter the grade: ");
		z=sc.next().charAt(0);
		Employee ep=new Employee(x,y,z);
		System.out.println("The salary after tax deduction is: "+ep.netsalary());
		System.out.println("Grade is: "+ep.grade());
	}
}