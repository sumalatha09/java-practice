package p2;
import java.util.Scanner;
import p1.user;
public class UsernameMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a user name:");
	String str=sc.next();
	System.out.println("Enter user id:");
	int id=sc.nextInt();
	System.out.println("Enter user location:");
	String loc=sc.next();
    user ob=new user(str,id,loc);
    ob.validateUsername();
    int length1=str.length();
    char ch1;
    int var1=0;
    
    if(length1>=5)
    {
    ch1=str.charAt(0);
    var1 =(int)ch1;
    if(var1>=65&&var1<=90||var1>=97&&var1<=122)
    {
    ob.displayUser();
    }
    }
	}

}
