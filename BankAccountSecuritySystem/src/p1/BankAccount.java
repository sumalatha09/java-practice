package p1;

public class BankAccount {
private long accountNumber;
private String holderName;
private double balance;

public BankAccount(long a, String b, double c)
{
	accountNumber=a;
	holderName=b;
	balance=c;
}
public void deposit(double x)
{
	if(x>0)
	{
		balance=balance+x;
		System.out.println("Amount deposited successfully");
	}
	else
	{
		System.out.println("Invalid deposit amount");
	}
}
public void withdraw(double cash)
{
	if(cash<=balance)
	{
		balance=balance-cash;
		System.out.println("Amount withdrawn successfully");

	}
	else
	{
		System.out.println("Insuffiecient balance");
	}
}
public void displayAccount()
{
	System.out.println("====Bank Account details====");
	System.out.println("Holder account number:"+accountNumber);
	System.out.println("Holder name:"+holderName);
	System.out.println("balance:"+balance);
}
}
