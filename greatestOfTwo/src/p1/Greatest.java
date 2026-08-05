package p1;

public class Greatest {
public int a;
public int b;
public Greatest(int x,int y)
{
	a=x;
	b=y;
}
public int getGreatest()
{
	if(a<0||b<0)
	{
		return -1;
	}
	else if(a==0||b==0)
	{
		return -2;
	}
	else
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}
}
