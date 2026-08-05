package p1;
import java.util.Scanner;
public class Mirrorimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String:");
     String str=sc.nextLine();
     int len=str.length();
     for(int i=0;i<=len-1;i++) {
    	 char ch=str.charAt(i);
    	 System.out.print(ch+"  ");
     }
     System.out.print("|");
     for(int j=len-1;j>=0;j--) {
    	 char ch=str.charAt(j);
    	 System.out.print("  "+ch);
     }
	}

}
