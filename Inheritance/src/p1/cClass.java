package p1;

public class cClass extends pClass{
	public int x;
	public static int y;
	
	public void m2() {
		System.out.println("==cClass instance m2()==");
		System.out.println("the value of x:"+x);
		System.out.println("the value of y:"+y);
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
	}
	public static void m22() {
		System.out.println("==cClass instance m22()==");
		//System.out.println("the value of x:"+x);
		System.out.println("the value of y:"+y);
		//System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
	}

}
