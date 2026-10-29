package p1;
import java.util.*;
public class Collection9 {

	public static void main(String[] args) {
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	numbers.add(15);
	numbers.add(42);
	numbers.add(8);
	numbers.add(67);
	numbers.add(23);
	int max=numbers.get(0);
	for(int i=0;i<numbers.size();i++)
	{
		if(max<numbers.get(i))
		{
			max=numbers.get(i);
		}
	}
	System.out.println(max);

	}

}
