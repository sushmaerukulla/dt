class Hello1
{
public static void main(String args[])
{
int num;
System.out.println("enter two numbers");
Scanner s=new Scanner(System.in);
num=s.nextInt();

if(num%2==0)
{
System.out.println("even");
}
else
System.out.println("odd");
}
}
