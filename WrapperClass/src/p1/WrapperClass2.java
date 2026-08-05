package p1;

public class WrapperClass2 {

	public static void main(String[] args) {
		//Autoboxing
		Integer ob1=12;  // Integer is class here so that ob1 acts as both object and variable.
		Float ob2=12.34f;
		Character ob3='S';
		Boolean ob4=true;  
		// 
        int i1=ob1;
        float i2=ob2;
        char i3=ob3;
        boolean i4=ob4;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
	}

}
