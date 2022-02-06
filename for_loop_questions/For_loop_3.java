// WAP to find the odd numbers between two certain numbers.
package com.company;
import java.util.Scanner;
public class Forloop
{
    public static void main(String[] args)
    {
        
        Scanner scr = new Scanner(System.in);
        System.out.println("input first number");
        int i = scr.nextInt();
        System.out.println("input second number");
        int j = scr.nextInt();
        System.out.println("the odd numbers between "+i+ " and " +j+" are :");

        for (int a = i; a < j; a++)
        {

            if (a % 2 != 0)
            {
                System.out.println(a);
            }
        }
    }
}
