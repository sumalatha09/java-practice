package p1;

public class Asciivalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("==uppercase letters==");
     for(int i=65;i<=90;i++) {
    	 char ch=(char)i;
    	 System.out.print(ch+"  ");
     }
     System.out.println();
     System.out.println("==lowercase letters==");
     for(int i=97;i<=122;i++) {
    	 char ch=(char)i;
    	 System.out.print(ch+"  ");
     }
     System.out.println();
     System.out.println("==numbers==");
     for(int i=48;i<=57;i++) {
    	 char ch=(char)i;
    	 System.out.println(ch);
     }
	}

}
