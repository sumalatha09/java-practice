package p1;

public class Checker {
	String username;
	String mailId;
	String password;
	int length=0;
	public Checker(String a, String b, String c)
	{
		username=a;
		mailId=b;
		password=c;
	}
	public void checkStrength(String x)
	{
		length=x.length();
		if(length<8)
		{
			System.out.println("Password is weak, fix your password! ");
		}
		else
		{
			System.out.println("Password is strong enough!!");
			displayDetails();
		}
	}
	public void displayDetails()
	{
		System.out.println("User details:");
		System.out.println("User name:"+username);
		System.out.println("User mail id:"+mailId);
		System.out.println("User password:"+password);
		
	}

}
