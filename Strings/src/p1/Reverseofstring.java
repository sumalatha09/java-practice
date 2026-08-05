package p1;
import java.util.Scanner;
public class Reverseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string:");
      String str=sc.nextLine();
      int len=str.length();
      int count=0;
      for(int i=0;i<=len-1;i++) {
    	  char ch=str.charAt(i);
    	   switch(ch) 
    	   {
    	   case 'a':count++;
    	   break;
    	   case 'e':count++;
    	   break;
    	   case 'i':count++;
    	   break;
    	   case 'o':count++;
    	   break;
    	   case 'u':count++;
    	   break;
    	   
    	   }
    	   
      }
      System.out.println("no.of vowels in the string is:"+count);	  
      }

}
