
package p2;
import java.util.Scanner;
import p1.Greatest;
public class GreatestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number:");
  int num1=sc.nextInt();
  System.out.println("Enter second number");
  int num2=sc.nextInt();
  Greatest ob=new Greatest(num1,num2);
  System.out.println("The output is:"+ob.getGreatest());
	}

}
