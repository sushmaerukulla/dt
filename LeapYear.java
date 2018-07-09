import java.util.*;
class LeapYear
{
public static void main(String args[])
{
int year;
Scanner s=new Scanner(System.in);
year=s.nextInt();
if(year%4==0 && year%100!=0 || year%400==0)
{
System.out.println("it is a leap year");
}
else
System.out.println("not a leap year");
}
}