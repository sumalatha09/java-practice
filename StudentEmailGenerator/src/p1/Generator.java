package p1;

public class Generator {
String studentName;
String studentId;
String email;
public Generator(String a, String b)
{
	studentName=a;
	studentId=b;
}
public void validateDetails()
{
	char ch=studentName.charAt(0);
    int length=studentName.length();
    if(length<3)
    {
    	System.out.println("Invalid input, name size should be >=3");
    }
    else if(studentId.length()<4)
    {
    	System.out.println("Invalid input, id size should be 4");
    }
    else
    {
    	
	if((ch>=65&&ch<=90||ch>=97&&ch<=122)&&(studentId.length()==4))
	{
		generateEmail();
		displayDetails();
		
	}
	else
	{
		System.out.println("Invalid name");
	}
	
    }
}
public void generateEmail()
{
	email=studentName.concat(studentId).concat("@college.com");
}
public void displayDetails()
{
	System.out.println("Displaying student details:");
	System.out.println("Student name:"+studentName);
	System.out.println("Student Id:"+studentId);
	System.out.println("Student email id:"+email);
}
}
