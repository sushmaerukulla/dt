import java.util.*;
class Lower
{
public static void main(String args[])
{
int i,a;
String str;
Scanner s=new Scanner(System.in);
char ch[]=new char[20];
str=s.nextLine();
for(i=0;i<6;i++)
{
ch[i]=str.charAt(i);
a=(int)ch[i];
if(ch[i]=='\0')
{
break;
}
a=a+32;
System.out.println((char)a);
}
}
}