import java.util.Scanner;
public class Recursion
{
    static int factorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("for what no you want to get factorial");
        int x = scr.nextInt();
        System.out.println("factorial of " + x + " is " + factorial(x));
    }
}
