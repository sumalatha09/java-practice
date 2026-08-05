import java.util.Scanner;
class Employee
{
int id;
String name;
int salary;
static int count=0;
Employee(int a, String b, int c)
{
count++;
id=a;
name=b;
salary=c;
}
void displayEmployee()
{
System.out.println("=====Employee details=====");
System.out.println("Employee id:"+id);
System.out.println("Employee name:"+name);
System.out.println("Employee salary:"+salary);
}
void calAnnualSal()
{

int asal=0;
asal=salary*12;
System.out.println("Your annual salary is:"+asal);



}
}

class EmployeeMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of employee's:");
int n=sc.nextInt();
Employee e[]=new Employee[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter employee id:");
int eid=sc.nextInt();
System.out.println("Enter employee name:");
String ename=sc.next();
System.out.println("Enter employee salary:");
int esal=sc.nextInt();
e[i]=new Employee(eid,ename,esal);

}
System.out.println("******Employeee details******");
for(int i=0;i<n;i++)
{
e[i].displayEmployee();

e[i].calAnnualSal();


System.out.println();
}
System.out.println("Count:"+Employee.count);
}
}