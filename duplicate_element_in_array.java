//Program to print the duplicate elements of an array in java.
public class duplicate_element_in_array {
    public static void main (String [] s)
    {
        int a[]= {12, 21, 35, 12, 65, 51, 35};
        for (int i=0 ; i<a.length ; i++)
        {
            for ( int j= i+1 ; j< a.length ; j++)
            {
                if (a[i] == a[j])
                System.out.println("Duplicate element in given array : " + a[j]);
            }
        }
    }
}
