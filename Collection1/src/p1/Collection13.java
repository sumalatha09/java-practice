package p1;
import java.util.*;
public class Collection13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		for(int i=0;i<numbers.size();i++)
		{
			if(numbers.get(i)<10)
			{
				numbers.remove(i);
			}
		}
		System.out.println("Updated List:"+numbers);
		System.out.println("Size:"+numbers.size());
		sc.close();
	}

}
