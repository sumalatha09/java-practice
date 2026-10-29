package p1;
import java.util.*;
public class Collection18 {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	for(int i=0;i<2;i++)
	{
		int last=list.get(list.size()-1);
		//list.set(i, list.get(list.size()-1));
		list.remove(list.size()-1);
		list.add(0,last);
	}
	
System.out.println(list);
	}

}
