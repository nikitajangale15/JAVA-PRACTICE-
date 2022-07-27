import java.util.Scanner;

public class fibonacci_series {
    public static void main(String [] s) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0, b=1;
        System.out.print( a + " , " + b + "  , ");
        int nextTerm;
        for ( int i=2; i< num; i++)
        {
            nextTerm = a + b;
            a=b;
            b= nextTerm;
            System.out.print(nextTerm+ " , ");
        }
    }
}
