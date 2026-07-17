import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
int n=sc.nextInt();
int nums[]=new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
{
 nums[i]=sc.nextInt();
}
int evenCount=0;
int oddCount=0;
int evenSum=0;
int oddSum=0;
for(int j=0;j<nums.length;j++)
{
if(nums[j]%2==0)
{
evenCount++;
evenSum=evenSum+nums[j];
}
else
{
oddCount++;
oddSum=oddSum+nums[j];
}

}
System.out.println("Count of even numbers is:"+evenCount);
System.out.println("Count of odd numbers is:"+oddCount);
System.out.println("sum of even numbers is:"+evenSum);
System.out.println("sum of odd numbers is:"+oddSum);
}
}