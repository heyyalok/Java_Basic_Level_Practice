// WAP to find the odd numbers between two certain numbers.
package com.company;
import java.util.Scanner;
public class V23forloop
{
    public static void main(String[] args)
    {
        //for (int i = 1; i<= 10; i++){
        //  System.out.println(i);
        //}
       /*
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("*");
        }

        */
        //int i = 10;
        //Scanner scr = new Scanner (System.in);
        //System.out.println("input first value");
        //int i = scr.nextInt();
        //System.out.println("input second value");
        //int j = scr.nextInt();
        // taking user input
        Scanner scr = new Scanner(System.in);
        System.out.println("input first number");
        int i = scr.nextInt();
        System.out.println("input second number");
        int j = scr.nextInt();
        System.out.println("the odd numbers between these are");

        for (int a = i; a < j; a++)
        {

            if (a % 2 != 0)
            {
                //System.out.println("the odd numbers between these are");
                System.out.println(a);
            }
        }
    }
}