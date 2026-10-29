package p1;
import java.util.*;
public class Collection5 {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		System.out.println(colors);
		System.out.println(colors.remove(1));
		System.out.println(colors);
		System.out.println(colors.size());
	}

}
