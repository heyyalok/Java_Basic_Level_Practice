public class Reversing_array{
public static void main(String[]args)
    {
    int [] array ={1,2,3,4,5,6,7,8,9};
    int length = array.length;
    int n = Math.floorDiv(1,2);
    int temp;

    for (int i = 0; i<n; i++)
    {
        temp = array[i];
        array[i] = array[length-i-1];
        array[length-i-1] = temp;
    }
    for (int element: array)
    {
        System.out.print(element+",");
    }
    }
  }
