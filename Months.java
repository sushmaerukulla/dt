import java.util.*;
class Months
{
public static void main(String args[])
{
int month;
System.out.println("enter month");
Scanner s=new Scanner(System.in);
month=s.nextInt();
switch(month)
{
case 1:
System.out.println("january");
break;
case 2:
System.out.println("feb");
break;
case 3:
System.out.println("march");
break;
case 4:
System.out.println("april");
break;
case 5:
System.out.println("may");
break;
case 6:
System.out.println("june");
break;
case 7:
System.out.println("july");
break;
case 8:
System.out.println("august");
break;
default:
System.out.println("enter proper month number");
break;
}
}
}