//Java program for Sorting Elements In An Array.

public class sort_the_array {
    public static void main(String []s)
    {
        int ar[] = {11, 91, 64, 73, 3, 59};
        int temp=0;
        for(int i=0 ;i<ar.length ; i++)
        {
            for (int j =i+1; j<ar.length ; j++)
            {
                if (ar[i] > ar[j])
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}
