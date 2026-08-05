package p1;
import java.util.Scanner;
import p1.Employee;
public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the no.of employees:");
           int n=Integer.parseInt(sc.nextLine());
           Employee ob[]=new Employee[n];
           System.out.println("enter the employee details:");
           for(int i=0;i<ob.length;i++)
           {
        	   ob[i]=new Employee();
        	   System.out.println("enter the employee id:");
        	   ob[i].id=sc.nextLine();
        	   System.out.println("enter the employee name:");
        	   ob[i].name=sc.nextLine();
        	   System.out.println("enter the employee designation:");
        	   ob[i].desg=sc.nextLine();
        	   System.out.println("enter employee basic salary:");
        	   ob[i].bSal=Integer.parseInt(sc.nextLine());
        	   ob[i].tSal=ob[i].bSal+(2*ob[i].bSal);
           }
           System.out.println("===employee details====");
           for(Employee k:ob) {
        	   System.out.println(k.toString());
        	   
           }
	}

}
