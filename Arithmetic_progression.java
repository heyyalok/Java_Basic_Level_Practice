import java.util.Scanner;
public class Arithmeticprogression
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("input first term");
        int first_term = scr.nextInt();
        System.out.println("input common difference");
        int difference = scr.nextInt();
        System.out.println("how many pattern you want");
        int total_pattern_length = scr.nextInt();
        System.out.println("Here is the pattern");
        for ( int i = first_term; i<= (first_term+(total_pattern_length-1)*difference); i= i+difference)
        {
            System.out.println(i);
        }
    }
}
