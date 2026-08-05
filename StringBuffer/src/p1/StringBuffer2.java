package p1;

public class StringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuffer sb=new StringBuffer("developer");
      StringBuffer sb1=new StringBuffer(sb);
      System.out.println("===sb===");
      System.out.println(sb.toString());
      System.out.println("capacity:"+sb.capacity());
      System.out.println("length:"+sb.length());
      System.out.println("===sb1===");
      System.out.println(sb1.toString());
      System.out.println("capacity:"+sb1.capacity());
      System.out.println("length:"+sb1.length());
      System.out.println("==delete operation on sb2==");
      sb1.delete(0,2);
      System.out.println("===sb1===");
      System.out.println(sb1.toString());
      System.out.println("capacity:"+sb1.capacity());
      System.out.println("length:"+sb1.length());
      System.out.println("===sb===");
      System.out.println(sb.toString());
      System.out.println("capacity:"+sb.capacity());
      System.out.println("length:"+sb.length());
      
	}

}
