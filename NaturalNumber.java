import java.util.*;

public class NaturalNumber {
    public static void main(String[] args)
    {
        int n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1 ; i<=n ; i++)
        {
            sum = sum + i;
        }
            System.out.println("Sum of N Natural number is "+ sum);
    }
}
