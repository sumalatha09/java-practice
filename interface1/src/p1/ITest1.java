package p1;

public interface ITest1 {
public abstract void m1(int x);
public static void m2(int y) {
	System.out.println("===static m2(y)====");
	System.out.println("The value of y:"+y);
}
public default void m3(int z) {
	System.out.println("====default m3(z)=====");
	System.out.println("The value of z:"+z);
}
}
