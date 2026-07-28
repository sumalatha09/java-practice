package p1;

public class Student {

	private int id;
	private String name;
	private int marks;
	public Student(int a, String b, int c)
	{
		id=a;
		name=b;
		setMarks(c);
	}
	public void setMarks(int x)
	{
		if(x<0|| x>100)
		{
			System.out.println("Invalid marks");
			marks=0;
		}
		else
		{
			marks=x;
		}
	}
	public void displayStudent()
	{
		System.out.println("***Student details***");
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student marks:"+marks);
	}
}
