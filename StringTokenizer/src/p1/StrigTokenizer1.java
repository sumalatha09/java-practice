package p1;
import java.util.*;
public class StrigTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        StringTokenizer ob=new StringTokenizer(str," ");
        System.out.println("====tokens====");
        while(ob.hasMoreTokens()) {
        	String tk=ob.nextToken();
        	StringBuffer sb=new StringBuffer(tk);
            System.out.println(sb.reverse());
        }
	}

}
