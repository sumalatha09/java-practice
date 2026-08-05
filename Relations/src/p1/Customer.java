package p1;

public class Customer {
public String id,name;
public Address ad=new Address();
public Contact ct=new Contact();
public String toString() {
	return id+" "+name+" "+ad.hNo+" "+ad.sname+" "+ad.city+" "+ad.state+" "+ad.pincode+" "+ct.mailid+" "+ct.pno;
}
}
