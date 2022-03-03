//1st approach
public class Reversing_array{
public static void main(String[]args)
    {
    int [] array ={1,2,3,4,5,6,7,8,9};
    int length = array.length;
    int n = Math.floorDiv(l,2);
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
//2nd approach
public class array_itrating
{
    public static void main(String[]args)
    {
        int [] arr ={121,26,38,43,59,60,76,81,49,90};
        //for (int i = 0; i<arr.length;i++)  // this can also be implimented
        for (int i = arr.length-1;i>=0;i--)
        {
            //System.out.print(arr[arr.length-i-1]+",");// if  the loop is set to be increment then this will follow
            System.out.print(arr[i]+",");
            // this will give output in the form of array
        }
    }
}
