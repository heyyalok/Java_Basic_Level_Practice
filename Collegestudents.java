// 17th feb 2022
//package com.company;
import java.util.Scanner;
public class Collegestudents
{
    public static void main(String[]args)
    {
     Scanner scr = new Scanner (System.in);
     System.out.println("how many students are there in your class");
     int n = scr.nextInt();
     System.out.println("enter the name of all "+n+" students: -");
     for (int i =0; i<=n; i++)
     {
         String name = scr.nextLine();
         System.out.println(name);
     }
     System.out.println("enter the Uni roll of all "+n+" students: -");
        for (int i =1; i<=n; i++)
        {
            int unirollno = scr.nextInt();
            System.out.println(unirollno);
        }
    }
}
