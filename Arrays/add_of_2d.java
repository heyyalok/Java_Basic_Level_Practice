public class addition
{
   public static void main(String[]args)
    {
        int [][]matrix =          {{87,65,54},
                                  {23,34,54}}:
        //                        +
        int [][]matrix2 =         {{76,12,23},
                                  {10,20,35}};
        //                        =
        int[][]resultmatrix =     {{0,0,0},
                                  {0,0,0}}:
        for (int i = 0; i<matrix.length ; i++)
        {
            for (int j = 0 ; j <matrix[i].length ; j++)
            {
                resultmatrix[i][j]= matrix[i][j]+matrix2[i][j];
                System.out.print(resultmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
