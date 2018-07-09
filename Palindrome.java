import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int i,count=0;
String str;
char ch=new char[20];
System.out.println("enter string");
Scanner s=new Scanner(System.in);
str=newLine();
ch=str.charAt(0);
while(ch[i]!='\0')
{
count++;
i++;
}
System.out.println("String="+count);
}
}
