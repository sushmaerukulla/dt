import java.util.*;
class Search
{
public static void main(String args[])
{
int i,num,n,count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of inputs");
n=s.nextInt();
int x[]=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
x[i]=s.nextInt();
}
System.out.println("enter the element to search");
num=s.nextInt();
for(i=0;i<n;i++)
{
if(x[i]==num)
{
count=1;
System.out.println("element found at"+i);
}
}
if(count==0)
System.out.println("not found");
}
}






