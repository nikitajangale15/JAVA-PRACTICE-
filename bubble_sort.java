//Program to implement bubble  sort algorithm in Java.

import java.util.Arrays;

public class bubble_sort 
{
    static void BubbleSort( int array[])
    {
        int size = array.length;
        for ( int i=0 ; i < size-1 ; i++)
        {
            for (int j = 0 ; j < size-i-1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main (String [] s)
    {
        int a[] = {2, 75, 38, 92, 2, 45};
        BubbleSort(a);
        System.out.println("Sorted array in ascending order : ");
        System.out.println(Arrays.toString(a));
    }
}
