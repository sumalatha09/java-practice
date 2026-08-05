class User
{
static int count=0;
User()
{
count++;
}
}
class UserMain
{
public static void main(String args[])
{
User u1=new User();
User u2=new User();
User u3=new User();
User u4=new User();
User u5=new User();
User u6=new User();
User ug=new User();
User u8=new User();
User u9=new User();
User u0=new User();
System.out.println("Users count is:"+User.count);
}
}
