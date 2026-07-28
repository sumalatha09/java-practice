package p2;
import java.util.Scanner;
import p1.Student;
public class StudentMain {

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student id:");
	int sid=Integer.parseInt(sc.nextLine());
	System.out.println("Enter student name:");
	String sname=sc.next();
	System.out.println("Enter studnet marks:");
	int smarks=sc.nextInt();
	Student ob=new Student(sid,sname,smarks);
	ob.setMarks(smarks);
	ob.displayStudent();

	
}

}
