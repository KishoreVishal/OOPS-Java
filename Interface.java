import java.util.Scanner;
interface Calculator
{
int add(int n1,int n2);
int sub(int n1,int n2);
int mul(int n1,int n2);
int div(int n1,int n2);
}
class Operation implements Calculator
{
public int add(int n1,int n2)
{
return n1+n2;
}
public int sub(int n1,int n2)
{
return n1-n2;
}
public int mul(int n1,int n2)
{
return n1*n2;
}
public int div(int n1,int n2)
{
return n1/n2;
}
}
class Cal
{
public static void main(String args[])
{
Operation o=new Operation();
Scanner s=new Scanner(System.in);
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("Enter your choice");
int choice=s.nextInt();
System.out.println("First Number:");
int a=s.nextInt();
System.out.println("Second Number:");
int b=s.nextInt();
switch(choice)
{
case 1:
System.out.println("Result="+o.add(a,b));
break;
case 2:
System.out.println("Result="+o.sub(a,b));
break;
case 3:
System.out.println("Result="+o.mul(a,b));
break;
case 4:
System.out.println("Result="+o.div(a,b));
break;
default:
System.out.println("Invalid choice");
}
}
}
