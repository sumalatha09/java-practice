package p2;
import java.util.Scanner;
import p1.Customer;
public class Customermain {
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  Customer ob=new  Customer();
  System.out.println("Enter customer id:");
  ob.setCid(sc.nextLine());
  System.out.println("Enter the customer name:");
  ob.setCname(sc.nextLine());
  System.out.println("enter the customer city:");
  ob.setCcity(sc.nextLine());
  System.out.println("enter the customer mail id:");
  ob.setCmailid(sc.nextLine());
  System.out.println("Enter the customer pno:");
  ob.setCpno(sc.nextLong());
  System.out.println("==Displaying details by using getter methods==");
  System.out.println("Cid:"+ob.getCid());
  System.out.println("Cname:"+ob.getCname());
  System.out.println("Ccity:"+ob.getCcity());
  System.out.println("Cmailid:"+ob.getCmailid());
  System.out.println("Cphno:"+ob.getCpno());
  }
}
