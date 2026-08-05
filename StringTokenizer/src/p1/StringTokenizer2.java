package p1;

import java.util.*;
public class StringTokenizer2{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		System.out.println("enter the delimiter:");
		String del=sc.nextLine();
		StringTokenizer ob=new StringTokenizer(str,del);
        System.out.println("count of tokens:"+ob.countTokens());
        System.out.println("===tokens===");
        while(ob.hasMoreTokens()) {
        	String tk=ob.nextToken();
        	System.out.println(tk.toString()); 
        }
	}

}
