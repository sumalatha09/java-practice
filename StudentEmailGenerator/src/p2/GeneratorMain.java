package p2;
import java.util.Scanner;
import p1.Generator;
public class GeneratorMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student name:");
	String sname=sc.next();
	System.out.println("Enter student id:");
	String sid=sc.next();
	Generator ob=new Generator(sname,sid);
	ob.validateDetails();
	}

}
