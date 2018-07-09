import java.util.Scanner;
 
class Tables
{
  public static void main(String args[])
  {
   int i,j; 
    for (i = 6; i <= 14; i++) {
      System.out.println("Multiplication table of "+i);
 
      for (j= 1; j<= 10; j++) {
         System.out.println(i+"*"+j+" = "+(i*j));
      }
    }
  }
}