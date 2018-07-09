import java.util.*;
class BasicPrograms
{
public static void main(String args[])
{
char ch;
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
ch=str.charAt(0);
if(ch>=65 && ch<=91)
{
System.out.println("capital");
}
else if(ch>=97 && ch<=123)
{
System.out.println("small");
}
else if(ch>='0' && ch<='9')
{
System.out.println("number");
}
else
System.out.println("special character");
}
}

