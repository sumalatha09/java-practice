package p1;
import java.util.Scanner;
public class SumDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int count=0;
         System.out.println("enter the row size:");
         int m=sc.nextInt();
         System.out.println("enter the column size:");
         int n=sc.nextInt();
         System.out.println("enter array elements:");
         Integer arr[][]=new Integer[m][n];
         for(int i=0;i<m;i++) {
        	 for(int j=0;j<n;j++) {
        		 arr[i][j]=sc.nextInt();
        	 }
         }
         System.out.println("displaying the matrix elements:");
         for(int i=0;i<m;i++) {
        	 for(int j=0;j<n;j++) {
        		 System.out.print(arr[i][j].toString()+" ");
        	 }
        	 System.out.println();
         }
         for(int i=0;i<m;i++) {
        	 for(int j=0;j<n;j++) {
        		 if(i==j) {
        			 count=count+arr[i][j];
        		 }
        	 }
        
         } 
    	 System.out.println("count of diagonal elements:"+count);
	}

}
