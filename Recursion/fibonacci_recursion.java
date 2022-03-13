import java.util.Scanner;
public class Fibonacci_recursion
{
    // static is used because we don't want to change the value of a,b and c in any methods
    static int a =0;
    static int b =1;
    static int c;
     static void printFibonacci(int n)
    {
        if (n > 0)
        {
            // swapped the number because in every iteration we want the value of a and b shifting to next terms
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+",");
            printFibonacci(n - 1);
        }
    }
    public static void main(String []args)
    {
        System.out.println("for what number you want to print fibonacci series");
        Scanner scr = new Scanner(System.in);
        int count = scr.nextInt();
        System.out.print(a+" "+b);
        printFibonacci(count);
    }
}
