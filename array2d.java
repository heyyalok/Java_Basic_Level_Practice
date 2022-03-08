import java.util.Scanner;
public class Array_2D
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("how many rows you want to add");
        int row = scr.nextInt();
        System.out.println("how many col you want to add");
        int col = scr.nextInt();
        //int[][] marks = {{row}, {col}};
        int [][] numbers = new int [row][col];
        for (int i =0; i< row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                numbers[i][j] = scr.nextInt();
            }
        }
        for (int i =0; i<row; i++)
        {
            for (int j =0; j<col ; j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
