import java.util.Scanner;
public class Array_input_using_methods
{
    void array (int n,int [] myArray)
    {
        for (int i = 0; i<n; i++)
        {
            System.out.print( myArray[i]+",");
        }
    }
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the length of array");
        int arraylength = scr.nextInt();
        System.out.println("input the element of array");
        int [] arrayinput = new int[arraylength];
        for (int i = 0; i<arraylength;i++)
        {
            arrayinput[i] = scr.nextInt();
        }
        Array_input_using_methods today = new Array_input_using_methods();
        today.array(arraylength,arrayinput);
    }
}
