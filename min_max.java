//find the maximum and minimum values of an array using for loops in java.
public class min_max {
    public int max (int a[])
    {
        int max=0;
        for( int i=0 ; i<a.length ; i++)
        {
         if (a[i] > max)   
            max = a[i];
        }
        return max ;
    }
    public int min (int a[])
    {
        int min = a[0];
        for (int i=0;i< a.length ; i++)
        {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static void main (String [] s)
    {
        int Array[] = {92, 23, 85, 6, 51, 11};
        min_max m = new min_max();
        System.out.println("Maximum value in array: " +m.max(Array));
        System.out.println("Minimum value in array: " +m.min(Array));
    }
}
