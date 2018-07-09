//2)Read a character and print it twicess
import java.util.*;
import java.lang.*;
class BasicProgram
{
public static void main(String args[])
{
String str;
char ch;
Scanner s=new Scanner(System.in);
str=s.nextLine();
ch=str.charAt(0);
System.out.println(ch);
System.out.println(ch);
}
}