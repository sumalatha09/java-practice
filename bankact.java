import java.util.Scanner;
class BankAccount
{
long accountNumber;
String holderName;
double balance;
BankAccount(long a, String b, double c)
{
accountNumber=a;
holderName=b;
balance=c;
}
void deposit()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the money you want to deposit:");
double money=sc.nextDouble();
balance=balance+money;
System.out.println("Total amount in the account after deposit is:"+balance);
}
void withdraw()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to withdraw:");
double amount=sc.nextDouble();
if(amount<=balance)
{
balance=balance-amount;
System.out.println("Amount Withdrawn successfully");
}
else
{
System.out.println("Insufficient balance");
}
}
void displayBalance()
{
System.out.println("=====Account details=====");
System.out.println("Account number:"+accountNumber);
System.out.println("Holder name:"+holderName);
System.out.println("Balance:"+balance);
}
}
class bankAccountMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter account number:");
long acno=sc.nextLong();
System.out.println("Enter account holder name:");
String name=sc.next();
System.out.println("Enter balance amount:");
double amt=sc.nextDouble();
BankAccount ob=new BankAccount(acno,name,amt);
ob.displayBalance();

ob.deposit();
ob.displayBalance();

ob.withdraw();
ob.displayBalance();

}
}