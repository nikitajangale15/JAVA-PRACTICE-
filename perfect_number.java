//Check Whether or Not the Number is a Perfect Number in Java
import java.util.Scanner;

public class perfect_number {
    public static void main(String[] s)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i=1; i<n ; i++)
        {
            if (n % i ==0)
            {
                sum= sum+i;
            }
        }
        if (sum == n )
            System.out.println (n +" is a perfect number");
        else
            System.out.println(n + " is not a perfect number");    
    }
}
