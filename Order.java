class Order
{
public static void main(String args[])
{
int i,temp,j;
int n[]={20,10,60,80,61};
for(i=0;i<=5;i++)
{
for(j=i+1;j<=5;j++)
{
if(n[i]>n[j])
{
temp=n[i];
n[i]=n[j];
n[j]=temp;
}
}
}
System.out.println("ascending order");
for(i=0;i<=5;i++);
{

System.out.println(n[i]);
}
}//main

}