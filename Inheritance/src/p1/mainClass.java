package p1;
import java.util.Scanner;
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     cClass ob=new cClass();
     System.out.println("enter the value of a:");
     ob.a=sc.nextInt();
     System.out.println("enter the value of b:");
     ob.b=sc.nextInt();
     System.out.println("enter the  value of x:");
     ob.x=sc.nextInt();
     System.out.println("enter the valu of y:");
     ob.y=sc.nextInt();
     ob.m1();
     pClass.m11();
     ob.m2();
     cClass.m22();
	}

}
