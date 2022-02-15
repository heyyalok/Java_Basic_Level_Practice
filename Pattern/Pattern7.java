
import java.util.Scanner;
public class StarPattern7
{
    public static void main(String[]args)
    {
     Scanner scr = new Scanner (System.in);
     System.out.println("how many times you want to run the loop");
     int n = scr.nextInt();
     for (int i = n; i >= 0; i--)
     {
         for (int j =3; j>= i; j--)
         {
             System.out.print(" ");
         }
         for (int k = 1; k<= i; k++)
         {
             System.out.print("*");
         }
         System.out.println("*");
     }
    }
}
