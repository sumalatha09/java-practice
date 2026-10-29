package p1;
import java.util.*;
public class Collection17 {

	public static void main(String[] args) {
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
     list1.add(50);
	ArrayList<Integer> list2=new ArrayList<Integer>();
	list2.add(30);
	list2.add(50);
	list2.add(60);
	list2.add(70);
	list2.add(10);
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<list1.size();i++)
	{
		for(int j=0;j<list2.size();j++)
		{
			if(list1.get(i)==list2.get(j))
			{
				list.add(list1.get(i));
			}
		}
	}
	System.out.println("Common elements: "+list);
	}

}
