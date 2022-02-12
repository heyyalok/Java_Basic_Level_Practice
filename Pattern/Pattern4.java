import java.util.Scanner;
public class StarPattern2
{
    public static void main(String[]args)
    {
        System.out.println("how many times you want to print");
        Scanner scr = new Scanner(System.in);
        //System.out.println("how many time you want to print the pattern");
        int n = scr.nextInt();
        for (int row = 0; row <n; row++)
        {
            for (int column = 0; column < row ;column++)
            {
               System.out.print("*");
            }
           System.out.print("# ");
        }
    }
}
