public class Multidimensionalarray
{
public static void main(String[]args)
    {
        int [][] building= new int [5][3];
        building [0][0] = 0;
        building [0][1] = 1;
        building [0][2] = 2;

        building [1][0] = 10;
        building [1][1] = 11;
        building [1][2] = 12;

        building [2][0] = 20;
        building [2][1] = 21;
        building [2][2] = 22;

        building [3][0] = 30;
        building [3][1] = 31;
        building [3][2] = 32;

        building [4][0] = 40;
        building [4][1] = 41;
        building [4][2] = 42;

        for (int floors = 0; floors <building.length; floors++)
        {
            for (int flats = 0; flats <building[floors].length; flats++)
            {
                System.out.println(building[floors][flats]);
            }
        }
        System.out.println();
    }
}
