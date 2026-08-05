package p1;

public class parent {
public static int a;
static {
	System.out.println("==parent class static bolck==");
	System.out.println("the value of a:"+a);

}
{
	System.out.println("===parent class instance bolck===");
	System.out.println("value of a:"+a);
}
}
