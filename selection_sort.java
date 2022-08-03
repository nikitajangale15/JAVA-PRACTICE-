//Java program to sort array elements using selection sort.
import java.util.Scanner;

public class selection_sort {
    public static void main(String s [])
    {
        int size, i, j, temp;
        int ar[] = new int [40];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        for (i=0; i< size ; i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.print("Sorting Array using selection sort : \n");
        for ( i=0; i<size ;i++)
        {
            for (j=i+1 ; j<size ; j++)
            {
                if (ar[i] > ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.print("Array after sorting \n");
        for (i=0 ; i<size ; i++)
        {
            System.out.print(ar[i]+ " ");
        }
    }
}
