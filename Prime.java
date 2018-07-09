import java.util.*;
class Prime
{
public static void main(String args[])
{
int num,i,count=0;
System.out.println("enter number");
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("prime number");
}
else 
System.out.println("not prime");
}
}