package p1;

public class ObjectArray1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Object ob[]=new Object[3];
		ob[0]=new Integer(9);
		ob[1]=new String("java");
		ob[2]=new Obj1("suma",8309140371L); 
       System.out.println("displaying values from object array:");
       for(Object k:ob) {
    	   System.out.println(k.toString());
       }
	}

}
