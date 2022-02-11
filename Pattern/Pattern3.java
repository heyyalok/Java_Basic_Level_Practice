package com.company;
import java.util.Scanner;
public class V25PracticeSet
{
    
    public static void main (String[]args)
    {
        Scanner scr = new Scanner (System.in);
        System.out.println("How many times u want to get printed the pattern");
        int n = scr.nextInt();

        System.out.println("Want to see Burj Khalifa is titled mode ......... ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j< i;j++)
            {
                System.out.print("*");
            }
            System.out.print(" \n ");
        }


        for (int i = n; i>0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
