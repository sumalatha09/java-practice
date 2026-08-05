import java.util.Scanner;
class Employee
{
 int employeeId;
 String name;
 int salary;
Employee(int a, String b, int c)
{
   employeeId=a;
   name=b;
   salary=c;
}
void calculateBonus()
{
int bonus=0;
 if(salary<30000)
{
  bonus=(salary*20/100);
}
else if(salary>=30000&&salary<=60000)
{
   bonus=(salary*10/100);
}
else
{
bonus=(salary*5/100);
}
System.out.println("=====Employee details====");
 System.out.println("Employee id:"+employeeId);
 System.out.println("Employee name:"+name);
 System.out.println("Employee salary:"+salary);
 System.out.println("Bonus:"+bonus);
}
}
class Employeemain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee id:");
int eid=sc.nextInt();
System.out.println("Enter Employee name:");
String ename=sc.next();
System.out.println("Enter Employee salary:");
int esal=sc.nextInt();
Employee ob=new Employee(eid,ename,esal);
ob.calculateBonus();
}
}







