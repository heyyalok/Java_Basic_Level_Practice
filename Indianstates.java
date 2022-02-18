//package com.company;
import java.util.Scanner;
public class Indianstate
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input your country name");
        String countryname = scr.nextLine();
        System.out.println("how many states are there in "+countryname);
        int numberofstates = scr.nextInt();
        System.out.println("Input the name of all the " +numberofstates+" states");
        for (int i=0;i<=numberofstates; i++)
        {
            String statename = scr.nextLine();
        }
        System.out.println("thank you for your valuable time that you share the name of all the states ");
    }
}
