package p1;
import java.util.*;
public class Collection14 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(7);
		numbers.add(4);
		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(1);
		int target=9;
		for(int i=0;i<numbers.size();i++)
		{
			for(int j=i+1;j<numbers.size();j++)
			{
				if(numbers.get(i)+numbers.get(j)==9)
				{
					System.out.println(numbers.get(i)+" "+"+"+" "+numbers.get(j)+" "+"="+" "+target);
				}
			}
			
		}
		System.out.println();
	}

}
