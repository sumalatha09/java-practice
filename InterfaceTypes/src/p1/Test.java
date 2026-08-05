package p1;

public interface Test {
public abstract void m1(int x);
public static void m2(int y) {
	System.out.println("====static m2(y)=====");
	System.out.println("The value of y:"+y);
}
}
