import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Enter any positive number ");
        int n = scr.nextInt();

        for(int i=1; i<=n; i++)
        {
            factorial *= i;
        }
        System.out.println("Factorial of "+n+ "is "+factorial);
    }
}
