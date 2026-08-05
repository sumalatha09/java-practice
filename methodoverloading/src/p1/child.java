package p1;

public class child extends parent{
public static void m(int a,int b,int c, int d) {
	System.out.println("===m(a,b,c,d)===");
	System.out.println("the value of a:"+a);
	System.out.println("the value of b"+b);
	System.out.println("the value of c:"+c);
	System.out.println("the value of d is :"+d);
}
public static  void m(int a,int b,int c) {
	System.out.println("===m(a,b,c)===");
	System.out.println("the value of a:"+a);
	System.out.println("the value of b:"+b);
	System.out.println("the value of c is:"+c);
}
public void access(int a,int b,int c,int d) {
	super.m(a); 
	super.m(a,b);
	this.m(a,b,c);
	this.m(a,b,c,d);
}
}
