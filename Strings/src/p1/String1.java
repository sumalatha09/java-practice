package p1;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the String:");
    String str=sc.nextLine();
    int len=str.length();
     System.out.println("==Reverse of a String is:");
     for(int i=len-1;i>=0;i--) {
    	 char ch=str.charAt(i);
    	 System.out.print(ch);
     }
	}

}
