//Java program to find number of digits in an integer.
import java.util.Scanner;

public class number_of_digit {
    public static void main (String [] s)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit=0;
        while (n != 0)
        {
            int last= n % 10;
            digit++;
            n = n /10;
        }
        System.out.print("Number of Digits = " +digit);
    }
}
