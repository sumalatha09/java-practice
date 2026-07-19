import java.util.Scanner;
class Product
{
int id;
String name;
int quantity;
int price;
int gst=0;

Product(int a, String b, int c, int d)
{
id=a;
name=b;
quantity=c;
price=d;

}
int bill=0;
int amount=0;
void calculateBill()
{
bill=price*quantity;
if(bill>10000)
{
gst=18;
amount=bill+(bill*gst/100);
}
else
{
gst=12;
amount=bill+(bill*gst/100);
}
}
void displayProduct()
{
System.out.println("======Product details======");
System.out.println("Product ID:"+id);
System.out.println("Product name:"+name);
System.out.println("Product price:"+price);
System.out.println("Quantity:"+quantity);
System.out.println("Bill :"+bill);
System.out.println("GST:"+gst);
System.out.println("FInal amount:"+amount);



}

}
class ProductMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter id:");
int pid=sc.nextInt();
System.out.println("Enter product name:");
String pname=sc.next();
System.out.println("Enter quantity:");
int pqauntity=sc.nextInt();
System.out.println("Enter price:");
int pprice=sc.nextInt();

Product ob=new Product(pid,pname,pqauntity,pprice);
ob.calculateBill();
ob.displayProduct();

sc.close();
}
}
