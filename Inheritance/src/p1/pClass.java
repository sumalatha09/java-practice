package p1;

public class pClass {
public int a;
public static int b;
public void m1() {
	System.out.println("==parent class instance m1()");
	System.out.println("the value of a:"+a);
	System.out.println("the value of b:"+b);
}
public static void m11() {
	System.out.println("==pClass static m11()==");
	//System.out.println("the value of a:"+a);
	System.out.println("the value of b:"+b);
}
}
