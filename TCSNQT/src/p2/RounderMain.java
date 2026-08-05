package p2;
import java.util.Scanner;
import p1.Rounder;
public class RounderMain {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
Rounder ob=new Rounder(n);
System.out.println("Output is:"+ob.oddRounder());

	}

}
