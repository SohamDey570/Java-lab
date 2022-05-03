import java.util.*;
class  abc
{
private String str;
public abc(String s)
{
str=s;
}
void reverse()
{
String q,p="";
q=str;
for(int i=0;i<q.length();i++)
p=(q.charAt(i))+p;
System.out.println("Reverse of the String is: "+p);
}
void Substring(int a,int b)
{
System.out.println("Substring is: "+str.substring(a,b));
}
void length()
{
System.out.println("Length of the String is: "+str.length());
}
void charat5()
{
System.out.println("Character at 5th position is: "+str.charAt(5));
}
void index(char ch)
{
String s1="",s2;
s1=str.toLowerCase();
s2=Character.toString(ch);
s2=s2.toLowerCase();
System.out.println("Index of "+ch+" is: "+s1.indexOf(s2));
}
}
class prog1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String: ");
String st=sc.nextLine();
abc pg=new abc(st);
System.out.println("Enter 1 to reverse the string.");
System.out.println("Enter 2 to print the substring.");
System.out.println("Enter 3 to calculate the string length.");
System.out.println("Enter 4 to fetch character at 5.");
System.out.println("Enter 5 to find the index of a character.");
System.out.println("Enter 6 to exit.");
int ch;
while(true)
{
System.out.print("Enter your choice: ");
ch=sc.nextInt();
switch(ch)
{
case 1:
pg.reverse();
break;
case 2:
int x,y;
System.out.print("Enter the first index: ");
x=sc.nextInt();
System.out.print("Enter the second index: ");
y=sc.nextInt();
pg.Substring(x,y);
break;
case 3:
pg.length();
break;
case 4:
pg.charat5();
break;
case 5:
char s;
System.out.print("Enter the character to be searched: ");
s=sc.next().charAt(0);
pg.index(s);
break;
default:
System.exit(0);
}
}
}
}
