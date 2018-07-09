import java.util.*;
class BigArray
{
Scanner s=new Scanner(System.in)
int r=new int[5];
int i,temp=0;
for(i=0;i<5;i++)
{
if(temp<r[i])
{
temp=r[i];
}
}
System.out.println("biggest="+temp);
}
