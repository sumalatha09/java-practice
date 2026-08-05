package p1;
// implementation class
public class Addition implements Arithmetic {
	//implemented method
	public int cal(int x,int y) {  
		return x+y; 
	}
	 //implemented method
	public void display(int k) {  
		System.out.println("===display method()===");
		System.out.println("the value of k is:"+k);
	}
	// non implemented method
	public void access(int z) {   
		System.out.println("===access(z)===");
		System.out.println("the value of z is:"+z);
	}
}
