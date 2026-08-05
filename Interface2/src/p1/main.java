package p1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter value-1:");
     int v1=sc.nextInt();
     System.out.println("Enter value-2");
     int v2=sc.nextInt();
     System.out.println("===Enter choice===");
     System.out.println("1.Greater Value\n2.Smaller Value");
     switch(sc.nextInt()) {
     case 1:
    	 GreaterValue gt=new GreaterValue();
    	 int r1=gt.comparision(v1, v2);
    	 System.out.println("Greater value:"+r1);
    	 break;
     case 2:
    	 SmallerValue sv=new SmallerValue();
    	 int r2=sv.comparision(v1, v2);
    	 System.out.println("Smaller Value:"+r2);
    	 break;
    default:
    	System.out.println("Invalid choice");
     }
	}

}
