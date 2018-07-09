import java.util.*;
class Email
{
public static void main(String args[])
{
int i;
int sCount=0,cCount=0,spCount=0,nCount=0;
String str;
System.out.println("enter string");
Scanner s=new Scanner(System.in);
char ch=new char[20];
str=s.nextLine();
for(i=0;i<6;i++)
{
ch[i]=str.charAt(i);
}
if(ch[i]>=97 && ch[i]<=122)
{
sCount++;
System.out.println("small="+sCount);
}
else if(ch[i]>=65 && ch[i]<=90)
{
cCount++;
System.out.println("capital="+cCount);
}
else if(ch[i]>='0' && ch[i]<='9')
{
spCount++;
System.out.println("Special character="+spCount);
}
else
{
nCount++;
System.out.println("nothing="+nCount);
}
}
}
