package com.company;
import java.util.Scanner;
public class StarPattern4
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("input how many times you want to run the loop");
        int n = scr.nextInt();

        for (int i =1; i<n; i++)
        {
            for (int j = 1; j<i; j++)
            {
                for (int k = 1; k<j; k++)
                {
                    System.out.print("#");
                }
                System.out.print("*");
            }
            System.out.println("&");
        }
        for (int i =n; i>1; i--)
        {
            for (int j = i; j>1; j--)
            {
                for (int k = j; k>1; k--)
                {
                    System.out.print("#");
                }
                System.out.print("*");
            }
            System.out.println("&");
        }
    }
}
