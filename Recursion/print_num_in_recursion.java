import java.util.Scanner;
public class Recursion
{
    static void Count_Number(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        Count_Number(n-1);
    }
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("from where you want to print the number");
        int x = scr.nextInt();
        Count_Number(x);
    }
}
