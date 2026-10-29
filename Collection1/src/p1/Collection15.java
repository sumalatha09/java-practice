package p1;
import java.util.*;
public class Collection15 {

	public static void main(String[] args) {
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	numbers.add(2);
	numbers.add(5);
	numbers.add(2);
	numbers.add(8);
	numbers.add(5);
	numbers.add(2);
	numbers.add(9);
	numbers.add(8);
	
	ArrayList<Integer> unique=new ArrayList<Integer>();
	for(int i=0;i<numbers.size();i++)
	{
		if(!unique.contains(numbers.get(i)))
		{
			unique.add(numbers.get(i));
		int count=0;
		for(int j=0;j<numbers.size();j++)
		{
			if(numbers.get(i).equals(numbers.get(j)))
			{
				count++;
			}
			
		}
		System.out.println(numbers.get(i)+" appears "+count+" times ");
	}
	}
	}
}
