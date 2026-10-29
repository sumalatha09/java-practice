package p1;
import java.util.*;
public class Collection11 {

	public static void main(String[] args) {
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(10);
	numbers.add(30);
	numbers.add(20);
	numbers.add(40);
	numbers.add(50);
	ArrayList<Integer> unique=new ArrayList<Integer>();
	for(int i=0;i<numbers.size();i++)
	{
		if(!unique.contains(numbers.get(i)))
			unique.add(numbers.get(i));
		
	}
	int sum=0;
   for(int i=0;i<unique.size();i++)
   {
	   sum=sum+unique.get(i);
   }
   System.out.println("Unique numbers:"+unique);
   System.out.println("Sum:"+sum);
	}

}
