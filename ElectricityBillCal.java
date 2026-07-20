import java.util.Scanner;
class ElectricityBill
{
int id;
String name;
int units;
int ucost=0;
ElectricityBill(int a, String b, int c)
{
id=a;
name=b;
units=c;
}
void displayDetails()
{
System.out.println("********Consumer details**********");
System.out.println("Consumer id:"+id);
System.out.println("Consumer name:"+name);
System.out.println("Units Consumed:"+units);
}
void billingRules()
{
if(units>=0&&units<=100)
{
ucost=5;
int bill=units*ucost;
System.out.println("TOtal bill you need to pay is:"+bill);
}
else if(units>=101&&units<=300)
{
ucost=7;
int bill=units*ucost;
System.out.println("TOtal bill you need to pay is:"+bill);
}
else
{
ucost=10;
int bill=units*ucost;
if(bill>5000)
{
int fbill=bill*10/100;
System.out.println("TOtal bill you need to pay is:"+(fbill+bill));
}
else
{
System.out.println("TOtal bill you need to pay is:"+bill);
}
}
}
}
class ElectricityBillGeneratorMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter consumer ID:");
int cid=sc.nextInt();
System.out.println("Enter consumer name:");
String cname=sc.next();
System.out.println("Enter number of units consumed:");
int cunits=sc.nextInt();

ElectricityBill ob=new ElectricityBill(cid,cname,cunits);
ob.displayDetails();
ob.billingRules();


}
}