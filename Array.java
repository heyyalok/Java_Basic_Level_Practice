public class Array_2D
{
    public static void main(String[]args)
    {
        String letter [][] = new String[3][3];
        letter [0][0]= "#";
        letter [0][1]= "#";
        letter [0][2]= "#";
        letter [1][0]= "#";
        letter [1][1]= "#";
        letter [1][2]= "#";
        letter [2][0]= "#";
        letter [2][1]= "#";
        letter [2][2]= "#";
        for (int row = 0; row<letter.length ; row++)
        {
            for (int col = 0 ; col <letter[row].length ; col ++ )
            {
                System.out.print(letter[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
