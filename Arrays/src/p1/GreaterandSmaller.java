package p1;
import java.util.Scanner;
public class GreaterandSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int n=sc.nextInt();
    Integer arr[]=new Integer[n];
    System.out.println("enter integer elements:");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    GreaterValue gv=new GreaterValue();
    int gval=gv.greater(arr);
    System.out.println("greater value:"+gval);
    SmallerValue sv=new SmallerValue();
    int ssum=sv.smaller(arr);
    System.out.println("smaller value:"+ssum);
  }
}
