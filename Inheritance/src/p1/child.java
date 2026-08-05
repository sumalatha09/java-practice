package p1;

public class child extends parent{
public static int b;
static {
	 System.out.println("==child class static block==");
	 System.out.println("the value of b:"+b);
}
}
