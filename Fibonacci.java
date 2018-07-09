import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
int n1=0,n2=0,n3,i,number;
System.out.println("enter number of elements");
Scanner s=new Scanner(System.in);
number=s.nextInt();
for(i=1;i<=number;++i)
{
System.out.println(n1+ " + ");
n3=n1+n2;

n1=n2;
n2=n3;


}
}
}
