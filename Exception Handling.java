import java.util.Scanner;
interface Operation
{
int deposit(int d);
int withdrawal(int w);
int d_balance(int b,int d);
int w_balance(int b,int w);
}
class Banking implements Operation
{
public int deposit(int d)
{
return d;
}
public int withdrawal(int w)
{
return w;
}
public int d_balance(int b,int d)
{
return d+b;
}
public int w_balance(int b,int w)
{
return b-w;
}
}
class Bank
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Banking bk=new Banking();
System.out.println("Account Holder Name:");
String name=sc.nextLine();
System.out.println("Account Number:");
int acc=sc.nextInt();
System.out.println("Initial Balance:");
int bal=sc.nextInt();
System.out.println("Operation:");
String op=sc.nextLine();
System.out.println("1.Deposit");
System.out.println("2.Withdrawal");
System.out.println("Enter your choice:");
int ch=sc.nextInt();
try
{
if(ch==1)
{
System.out.println("Deposit Amount:");
int da=sc.nextInt();
System.out.println("Amount Deposited Successfully");
System.out.println("Available Balance:Rs."+bk.d_balance(bal,da));
}
else if(ch==2)
{
System.out.println("Withdrawal Amount:");
int wa=sc.nextInt();
if(wa>bal)
{
throw new Exception("Insufficient Balance");
}
System.out.println("Transaction succeeded");
System.out.println("Available Balance:Rs."+bk.w_balance(bal,wa));
}
}
catch(Exception e)
{
System.out.println("Ttransaction Failed");
System.out.println("Available Balance:Rs."+bal);
}
}
}
