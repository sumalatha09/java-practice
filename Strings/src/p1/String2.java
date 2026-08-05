package p1;
import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String str=sc.next();
int length=str.length();
System.out.print("Reverse of a string is:");
for(int i=length-1;i>=0;i--)
{
	char ch=str.charAt(i);
	System.out.print(ch);
}
sc.close();
}

}
