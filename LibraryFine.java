import java.util.Scanner;
class Library
{
String stuname;
String bookname;
int issueDay;
int returnDay;
int fine=0;
Library(String a, String b, int c, int d)
{
stuname=a;
bookname=b;
issueDay=c;
returnDay=d;
}
void calculateFine()
{
int lateDays=returnDay-issueDay;
if(returnDay<issueDay)
{
System.out.println("Invalid return day");
}
else if(lateDays<=5)
{
fine=lateDays*2;
}
else if(lateDays<=10)
{
fine=(5*2+(lateDays-5)*5);
}
else
{
fine=(5*2)+(5*5)+(lateDays-10)*10;
}
}
void displayDetails()
{
System.out.println("********Details************");
System.out.println("Student name is:"+stuname);
System.out.println("Book name is:"+bookname);
System.out.println("Issue Day is:"+issueDay);
System.out.println("Return Day is:"+returnDay);
System.out.println("Fine is:"+fine);
}
}
class LibraryMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter student name:");
String sname=sc.next();
System.out.println("Enter book name:");
String bname=sc.next();
System.out.println("Enter book issue day:");
int iday=sc.nextInt();
System.out.println("Enter book return day:");
int rday=sc.nextInt();
Library ob=new Library(sname,bname,iday,rday);
ob.calculateFine();
ob.displayDetails();
sc.close();
}
}