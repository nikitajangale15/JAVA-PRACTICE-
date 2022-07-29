package DSA;
import java.util.Scanner;
public class linear_search {
    private static void LinearSearch (int ar[], int item )
    {
        for (int i=0 ; i<ar.length ; i++)
        {
            if (ar[i] == item)
            {
                System.out.println(item + "found at : " + i);
                return;
            }
        }
        System.out.println(item +"not found");
    }
    public static void main(String[] s)
    {
        int ar[] ={14, 22, 42, 6, 56, 32, 98, 73};
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        LinearSearch(ar, item);
    }
}