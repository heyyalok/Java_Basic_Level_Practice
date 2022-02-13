import java.util.Scanner;
public class Pattern5
{
    public static void main(String [] args)
    {
            Scanner scr = new Scanner(System.in);
            System.out.println("how many times you want to run the loop");
            int n = scr.nextInt();

        for (int i = 1; i<n; i++)
        {
            for (int j = 1; j<i ;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(i+"\n");
        }
    }
}
