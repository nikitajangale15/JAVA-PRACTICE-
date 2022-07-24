import java.util.Scanner;

public class Even_odd {
    public static void main (String [] args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2==0)
            System.out.println("Given number " + n + " is even");
        else 
            System.out.println("Given number " + n + " is odd");
    
    }
}
