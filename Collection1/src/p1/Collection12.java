package p1;
import java.util.*;
public class Collection12 {

	public static void main(String[] args) {
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	numbers.add(12);
	numbers.add(7);
	numbers.add(18);
	numbers.add(5);
	numbers.add(20);
	numbers.add(9);
	numbers.add(14);
	numbers.add(3);
	ArrayList<Integer> even=new ArrayList<Integer>();
	ArrayList<Integer> odd=new ArrayList<Integer>();
	int esum=0;
	int osum=0;
	for(int i=0;i<numbers.size();i++)
	{
		if(numbers.get(i)%2==0)
		{
			even.add(numbers.get(i));
			esum=esum+numbers.get(i);
		}
		else
		{
			odd.add(numbers.get(i));
			osum=osum+numbers.get(i);
		}
	}
	System.out.println("Even numbers:"+even);
System.out.println("Odd Numbers:"+odd);
System.out.println("Even sum:"+esum);
System.out.println("Odd sum:"+osum);
	}

}
