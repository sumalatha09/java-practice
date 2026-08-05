package p2;

import p1.Product1;
import java.util.Scanner;
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
    Product1 ob=new Product1();
    System.out.println("Enter the product code:");
    ob.setCode(sc.nextLine());
    System.out.println("Enter the product name:");
    ob.setName(sc.nextLine());
    System.out.println("Enter product price:");
    ob.setPrice(sc.nextFloat());
    System.out.println("***Displaying details***");
    System.out.println("Product code:"+ob.getCode());
    System.out.println("Product name:"+ob.getName());
    System.out.println("Product price:"+ob.getPrice());
	}

}
