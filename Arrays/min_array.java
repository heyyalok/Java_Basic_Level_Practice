public class min_array
{
    public static void main(String[]args)
    {
        int min = Integer.MAX_VALUE;
        //int j = 0;
        int []array = {87,12,34,32,98,54};
        for (int i = 0; i<array.length;i++)
        {
            int j =array[i];
            if( j<min)
            {
                min = j;
            }
        }
        System.out.println(min);
    }
}
