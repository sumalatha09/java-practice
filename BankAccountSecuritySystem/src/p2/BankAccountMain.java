package p2;
import java.util.Scanner;
import p1.BankAccount;
public class BankAccountMain 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter account number:");
long anum=sc.nextLong();
System.out.println("Enter account holder name:");
String hname=sc.next();
System.out.println("Enter balance:");
double bal=sc.nextDouble();

BankAccount ob=new BankAccount(anum,hname,bal);
ob.displayAccount();

System.out.println("Enter amount to deposit:");
double dep = sc.nextDouble();
ob.deposit(dep);

ob.displayAccount();

System.out.println("Enter amount to withdraw:");
double wd = sc.nextDouble();
ob.withdraw(wd);

ob.displayAccount();


}
}
