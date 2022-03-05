public class sorted_array_or_not
{
  public static void main(String[]args)
    {
        boolean issorted = true;
        int []array = {23,98,12,89,65,12,90};
        for (int i = 0; i< array.length ;i++)
        {
            if (array[i]>array[i+1])
            {
                issorted = false;
                break;
            }
        }
        if (issorted)
        {
            System.out.println("the array is sorted");
        }
        else
        {
            System.out.println("the array is not sorted");
        }
    }
}
