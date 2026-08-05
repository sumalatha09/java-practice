package p1;
import java.util.Scanner;
public class Multidimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows:");
		int n=sc.nextInt();
		System.out.println("enter the no.of columns:");
		int m=sc.nextInt();
		Integer ob[][]=new Integer[n][m];
		System.out.println("enter the integer elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ob[i][j]= new Integer(sc.nextInt());
				
			}
		}
		System.out.println("===displaying the data===");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(ob[i][j].toString()+" ");
				
			}
			System.out.println();
		}
		
	}

}
