public class Sum_in_java
{
public static void main(String[]args)
    {
        int num = 6;
        int t ;
        boolean isInArray = false;
        int []marks ={65,34,65,98,23,12};

        // using for each loop
        /*
        for (int e:marks)
        {
            if(num == e)
            {
                isInArray= true;
                break;
            }
        }
        */
        
        // using for loop
        /*
        for (int i=0; i<marks.length;i++)
        {
            t = marks[i];
            if (num == t)
            {
                isInArray= true;
                break;
            }
        }
        */
        if (isInArray)
        {
            System.out.println("the value is present in the array");
        }
        else
        {
            System.out.println("the value is not present in array");
        }
   }
}
