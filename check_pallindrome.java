// Check Whether the number is Pallindrome or not.
import java.util.Scanner;

public class check_pallindrome {
    public static void main(String [] s)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0, rem, temp;
        temp = num;
        while (temp != 0)
       {
     	rem = temp % 10;
        rev = rev * 10 + rem;
     	temp /= 10;
       };
        if (num == rev)
       System.out.println (num + " is Palindrome");
        else
       System.out.println (num + " is not Palindrome");
    }
}
