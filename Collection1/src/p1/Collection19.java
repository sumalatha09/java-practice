package p1;
import java.util.*;
public class Collection19 {

	public static void main(String[] args) {
ArrayList<Integer> number=new ArrayList<Integer>();
number.add(1);
number.add(2);
number.add(4);
number.add(5);
number.add(6);
int sum=0;
for(int i=0;i<number.size();i++)
{
	sum=sum+number.get(i);
}
int n=number.get(number.size()-1);
int esum=n*(n+1)/2;
int ans=esum-sum;
System.out.println("Missing number:"+ans);
	}

}
