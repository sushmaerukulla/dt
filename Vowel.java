
import java.util.*;
class Vowel
{
public static void main(String args[])
{
String str;
System.out.println("enter character");
Scanner s=new Scanner(System.in);
str=s.nextLine();
char ch=str.charAt(0);
switch(ch)
{

case 'a':

case 'e':
case 'i':

case 'o':

case 'u':

case 'A':
System.out.println("vowel");
break;

default:
System.out.println("consonant");
break;

case 'E':

case 'I':

case 'O':

case 'U':
System.out.println("vowel");
break;
}
}
}
