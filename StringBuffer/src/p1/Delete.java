package p1;
import java.util.Scanner;
public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   StringBuffer sb=new StringBuffer();
   System.out.println("==Buffer status==");
   System.out.println("Default capacity:"+sb.capacity());
   System.out.println("length:"+sb.length());
   while(true) {
	   System.out.println("==choice==");
	   System.out.println("1.append()\n2.delete()\n3.reverse()");
	   System.out.println("enter the choice:");
	   switch(Integer.parseInt(sc.nextLine())) {
	   case 1:
		   System.out.println("enter the data:");
		   sb.append(sc.nextLine());
		   break;
	   case 2:
		   if(sb.length()!=0) {
			   System.out.println("enter the starting index value:");
			   int i1=Integer.parseInt(sc.nextLine());
			   if(i1>=0&&i1<sb.length()) {
				   System.out.println("enter the ending index value:");
				   int i2=Integer.parseInt(sc.nextLine());
				   if(i2>=i1&&i2<sb.length()) {
					   sb.delete(i1, i2);
					   System.out.println("data in buffer:"+sb.toString());
				   }
				   else {
					   System.out.println("invalid index value");
				   }
			   }
			   else {
				   System.out.println("invalid starting index");
			   }
		   }
		   else {
			   System.out.println("buffer is empty");
		   }
	   }
	   break;
	
		   
   }
}

}
