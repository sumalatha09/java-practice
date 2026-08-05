import java.util.Scanner;
class StudentAttendance
{
String name;
int id;
int totalclasses;
int attended;
float attendance;
StudentAttendance(String a, int b, int c, int d)
{
name=a;
id=b;
totalclasses=c;
attended=d;
}
void calculateAttendancePercentage()
{
attendance=((float)attended/totalclasses)*100;
System.out.printf("Your attendance percentage is: %.2f%%\n",attendance);
}
void eligibleForExam()
{
if(attendance>=75)
{
System.out.println("You are eligible to write exam");
}
else
{
System.out.println("You are not eligible to write exam");
}
}
}
class StudentMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
System.out.println("Enter student name:");
String sname=sc.next();
System.out.println("Enter student id:");
int sid=sc.nextInt();
System.out.println("Enter total classes conducted:");
int total=sc.nextInt();
System.out.println("Enter total classes attended:");
int attended=sc.nextInt();
StudentAttendance ob=new StudentAttendance(sname,sid,total,attended);
ob.calculateAttendancePercentage();
ob.eligibleForExam();
sc.close();
}
}













