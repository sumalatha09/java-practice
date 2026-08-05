package p1;
import java.util.Scanner;
public class Allinone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string:");
       String str=sc.nextLine();
       int len=str.length();
       int vc=0;
       int cc=0;
       int nc=0;
       int oc=0;
       for(int i=0;i<=len-1;i++) {
    	  char ch=str.charAt(i);
    	  int k=(int)ch;
    	  if((k>=65&&k<=90 )||(k>=97&&k<=122) ) {
    		  cc++;
    	  }if(k>=48&&k<=57) {
    		  nc++;
    	  }
    	  switch(ch) {
    	  case 'a':
    	  case 'A':vc++;
    	  break;
    	  case 'e':
    	  case 'E':vc++;
    	  break;
    	  case 'i':
    	  case 'I':vc++;
    	  break;
    	  case 'o':
    	  case 'O':vc++;
    	  break;
    	  case 'u':
    	  case 'U':vc++;
    	  break;
    	  }
    	  
       }
       System.out.println("Vowels count is:"+vc);
       System.out.println("Consonant count is:"+(cc-vc));
       System.out.println("Numbers count is:"+nc);
       System.out.println("Others count is:"+(len-(cc+nc)));
	}

}
