public class Constellation
{
    public static void main(String[]args)
    {
        for (int row =0; row <3;row++)
        {
            for (int col = 0; col<18 ; col++)
            if (col == 3 || col == 7 || col == 11)
              {
                  System.out.print("#");
              }
            else if (  col == 1 & row == 0
                    || col == 1 & row == 1
                    || col == 5 & row == 1
                    || col == 8 & row == 1
                    || col ==10 & row == 1
                    || col ==15 & row == 0
                    || col ==16 & row == 2
                    || col ==17 & row == 0)
            {
                 System.out.print(".");
            }
            else
            {
                 System.out.print("*");
            }
                 System.out.println();
        }
    }
}
