package p1;
import java.util.*;
public class Collection6 {

	public static void main(String[] args) {
		ArrayList<String> languages=new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.set(1,"JavaScript");
		System.out.println(languages);
		System.out.println(languages.size());

	}

}
