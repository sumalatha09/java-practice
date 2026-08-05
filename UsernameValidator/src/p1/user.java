package p1;

public class user {
	String username;
	int id;
	String location;
	int length=0;
	char ch;
	int var;
	public user(String x, int y, String z)
	{
		username=x;
		id=y;
		location=z;
	}
	
	public void validateUsername()
	{
		length=username.length();
		if(length<5)
		{
			System.out.println("Inavlid input");
		}
		else
		{
		   	ch=username.charAt(0);
		   	var=(int)ch;
		   	if(var>=65&&var<=90||var>=97&&var<=122)
		   	{
		   		System.out.println("***Displaying results***");
		   		System.out.println("Valid input");
		   	}
		   	else
		   	{
		   		System.out.println("Invalid input");
		   	}
		}
	}
	public void displayUser()
	{
		System.out.println("***User details***");
		System.out.println("User name:"+username);
		System.out.println("User id:"+id);
		System.out.println("User location:"+location);
		
	}

}
