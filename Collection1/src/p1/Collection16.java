package p1;
import java.util.*;
public class Collection16 {

	public static void main(String[] args) {
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	numbers.add(0);
	numbers.add(5);
	numbers.add(0);
	numbers.add(3);
	numbers.add(8);
	numbers.add(0);
	numbers.add(2);
	numbers.add(7);
	for(int i=0;i<numbers.size();i++)
	{
		int temp;
		if(numbers.get(i)==0)
		{
			temp=numbers.get(i);
			numbers.remove(i);
			numbers.add(0);
			
		}
	}
	System.out.println(numbers);
	}

}
