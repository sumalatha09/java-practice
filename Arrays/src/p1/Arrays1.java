package p1;
import java.util.Scanner;
public class Arrays1 {
     @SuppressWarning
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      Integer arr[]=new Integer[n];
      System.out.println("enter n integer values:");
      for(int i=0;i<arr.length;i++){
    	  arr[i]=new Integer(sc.nextInt());
      }
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("values are:"+arr[i] );
      }
      System.out.println("displaying the elements using for each loop:");
      for(Integer j:arr) {
    	  System.out.println(j);
      }
	}

}
 