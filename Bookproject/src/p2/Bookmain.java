package p2;
import java.util.Scanner;
import p1.Bookdetails;

public class Bookmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     Bookdetails ob=new Bookdetails();
     System.out.println("Enter the book code:");
     ob.bcode=sc.nextLine();
     System.out.println("Enter the book name:");
     ob.bname=sc.nextLine();
     System.out.println("Enter the book author:");
     ob.bauthor=sc.nextLine();
     ob.getbookdetails();
	}

}
