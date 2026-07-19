import java.util.Scanner;
class Student
{
int id;
String name;
int marks;
Student(int a, String b, int c)
{
id=a;
name=b;
marks=c;
}
void isPassed()
{
if(marks<=0||marks>100)
{
System.out.println("You are passed");
}
else if(marks>=40)
{
System.out.println("Invalid marks"); 
}
else
{
System.out.println("You are failed");
}
}
void displayStudent()
{
System.out.println("====Student details====");
System.out.println("Student id:"+id);
System.out.println("Student name:"+name);
System.out.println("Students marks:"+marks);
}
}
class StudentMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

Student st[]=new Student[5];
for(int i=0;i<5;i++)
{
System.out.println("Enter student id:");
int sid=sc.nextInt();
System.out.println("Enter student name:");
String sname=sc.next();
System.out.println("Enter student marks:");
int smarks=sc.nextInt();
st[i]=new Student(sid,sname,smarks);
}
System.out.println("********Student reports*******");
for(int i=0;i<5;i++)
{
st[i].displayStudent();

st[i].isPassed();
System.out.println();
}
}
}