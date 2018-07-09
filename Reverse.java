import java.util.*;
class Reverse
{
public static void main(String args[])
{
int n,num,a=0;
System.out.println("enter number");
Scanner s=new Scanner(System.in);
num=s.nextInt();
while(num!=0)
{
n=num%10;
a=a*10+n;
num=num/10;
}
if(a==num)
{
System.out.println("palindrome");
}
else
System.out.println("not a palindrome");
}
}