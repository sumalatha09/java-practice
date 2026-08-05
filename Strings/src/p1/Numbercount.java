package p1;
import java.util.Scanner;
public class Numbercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int len=str.length();
       int count=0;
       for(int i=0;i<=len-1;i++) {
    	   char ch=str.charAt(i);
    	   int z=(int)ch;
    	   if(z>=48&&z<=57) {
    		   count++;
    	   }
       }
       System.out.println("count of numbers:"+count);
	}

}
