package p1;
import java.util.*;
public class Stringjoiner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===date of joining===");
		StringJoiner sj=new StringJoiner("-");
		sj.setEmptyValue("DOJ details not available");
		System.out.println(sj.toString());
		System.out.println("enter the date:");
		sj.add(sc.nextLine());
		System.out.println("enter the month:");
        sj.add(sc.nextLine());
        System.out.println("enter the year:");
        sj.add(sc.nextLine());
        System.out.println("user-DOJ:"+sj.toString());
        System.out.println("===user address===");
        StringJoiner sj1=new StringJoiner("-");
        sj1.setEmptyValue("user address is not available...");
        System.out.println(sj1.toString());
        System.out.println("enter the city:");
        sj1.add(sc.nextLine());
        System.out.println("enter the state");
        sj1.add(sc.nextLine());
        System.out.println("enter the pincode:");
        sj1.add(sc.nextLine());
        System.out.println("user address:"+sj1.toString());
        System.out.println(sj.merge(sj1));
	}

}
