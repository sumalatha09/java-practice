package p1;
import java.util.Scanner;
public class Id {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a roll number:");
	String str=sc.next();
	int len=str.length();
	if(len==10)
	{
		String substr=str.substring(6, 8);
		switch(substr)
		{
		case "01":
		System.out.println("Civil branch");
		break;
		case "02":
		System.out.println("EEE branch");
		break;
		case "03":
		System.out.println("Mechanical branch");
		break;
		case "04":
		System.out.println("ECE branch");
		break;
		case "05":
		System.out.println("CSE branch");
		break;
		default:
		System.out.println("Invalid branch number");
	
		}
	}
	else
	{
		System.out.println("Invalid roll number");
	}

	}

}
