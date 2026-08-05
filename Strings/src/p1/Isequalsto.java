package p1;

public class Isequalsto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="Suma";
         String s2="Suma";
         System.out.println("==String literal process==:");
         if(s1==s2) {
        	 System.out.println("Strings are equal");
         }else {
        	 System.out.println("Strings are not equal");
         }
         String s3=new String("Hello");
         String s4=new String("Hello");
         System.out.println("==new operator abject creation==");
         if(s3==s4) {
        	 System.out.println("STring are equal");
         }else {
        	 System.out.println("Strings are not equal");
         }
	}

}
