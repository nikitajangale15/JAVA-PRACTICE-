import java.util.Scanner;

public class number2 {
    public static void main (String [] args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n%2==0)
            System.out.println("Given number " + n + " is even");
        else 
            System.out.println("Given number " + n + " is odd");
    
    }
}
