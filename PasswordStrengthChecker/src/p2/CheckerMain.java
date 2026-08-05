package p2;
import p1.Checker;
import java.util.Scanner;
public class CheckerMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter user name:");
	String uname=sc.next();
	System.out.println("Enter user mail id:");
	String  uid=sc.next();
	System.out.println("Enter password:");
	String upword=sc.next();
	Checker ob=new Checker(uname,uid,upword);
	ob.checkStrength(upword);
	

	}

}
