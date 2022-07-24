import java.util.*;
public class number5 {
    public static void main(String [] s)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0 , rem;
        while (num != 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /=10; 
        };
        System.out.println("Reversed Number: " + rev);
    }
}
