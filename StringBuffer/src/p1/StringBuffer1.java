package p1;
import java.util.Scanner;
public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     StringBuffer sb=new StringBuffer("program");
     System.out.println("default capacity:"+sb.capacity());
     System.out.println("length:"+sb.length());
     sb.append("language");
     System.out.println("the string is:"+sb.toString());
     System.out.println("default capacity:"+sb.capacity());
     System.out.println("length:"+sb.length());
     sb.append("developer");
     System.out.println("the string is:"+sb.toString());
     System.out.println("default capacity:"+sb.capacity());
     System.out.println("length:"+sb.length());
     
	}

}
