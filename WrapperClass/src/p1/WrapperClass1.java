package p1;

public class WrapperClass1 {

	public static void main(String[] args) {
		Integer ob1=new Integer(12); // 
        Integer ob2=new Integer("23");
        Float ob3=new Float(12.98f);
        Float ob4=new Float(9.993674);
        Float ob5=new Float("1.43");
        Character ob6=new Character('s');
        Boolean ob7=new Boolean("true");
        Boolean ob8=new Boolean(false);
        System.out.println("data in ob1:"+ob1.toString());
        System.out.println("data in ob2:"+ob2.toString());
        System.out.println("data in ob3:"+ob3.toString());
        System.out.println("data in ob4:"+ob4.toString());
        System.out.println("data in ob5:"+ob5.toString());
        System.out.println("data in ob6:"+ob6.toString());
        System.out.println("data in ob7:"+ob7.toString());
        System.out.println("data in ob8:"+ob8.toString());
	}

}
