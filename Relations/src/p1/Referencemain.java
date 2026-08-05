package p1;
import java.util.*;
public class Referencemain {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Customer ob=new Customer();
	System.out.println("enter the customer id:");
	ob.id=sc.nextLine();
	System.out.println("enter the customer name:");
	ob.name=sc.nextLine();
	System.out.println("enter the house no:");
	ob.ad.hNo=sc.nextLine();
	System.out.println("enter the street name:");
	ob.ad.sname=sc.nextLine();
	System.out.println("enter the city:");
	ob.ad.city=sc.nextLine();
    System.out.println("enter the state:");
    ob.ad.state=sc.nextLine();
    System.out.println("enter the pincode:");
    ob.ad.pincode=Integer.parseInt(sc.nextLine());
    System.out.println("enter the mail id:");
    ob.ct.mailid=sc.nextLine();
    System.out.println("enter the phone no:");
    ob.ct.pno=Long.parseLong(sc.nextLine());
    String data=ob.toString();
    System.out.println(data);
}
}
