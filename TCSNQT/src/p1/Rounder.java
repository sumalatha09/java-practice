package p1;

public class Rounder {
public int a;
public int res;
public Rounder(int x)
{
	a=x;
}
public int oddRounder()
{

	if(a==0||a<0)
	{
		return 0;
	}
	else if(a%2==0)
	{
		return a;
	}
	else
	{
		res=((a/10)+1)*10;
		return res;
	}
}
}
