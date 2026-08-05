package p1;
import java.util.Scanner;
public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
       System.out.println("BufferStatus:");
       System.out.println("DefsultCapacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       while(true)//to run the program until we close it
    	   {
    	   System.out.println("choice :");
    	   System.out.println("1.append\n2.insert");
    	   System.out.println("enter choice");
    	   switch(Integer.parseInt(sc.nextLine())) {
    	   case 1:
    		   System.out.println("enter the data:");
    		   sb.append(sc.nextLine());
    		   System.out.println("data in buffer:"+sb.toString());
    		   System.out.println("Default capacity:"+sb.capacity());
    		   System.out.println("length:"+sb.length());
    		   break;
    	   case 2:
    		   if(sb.length()!=0) 
    		   {
    			System.out.println("Enter the index value:");
    			int index=Integer.parseInt(sc.nextLine());
                if(index>=0&&index<sb.length()) 
                {
                	System.out.println("Enter the data:");
                	sb.insert(index,sc.nextLine());
                	System.out.println("data in buffer:"+sb);
                }
                else 
                {
                	System.out.println("Invalid index value......");
                }
    		   }
    		   else 
    		   {
               	System.out.println("buffer is empty");
               }
    		   System.out.println("default capacity:"+sb.capacity());
    		   System.out.println("length"+sb.length());
    	   }
       }
	}

}
