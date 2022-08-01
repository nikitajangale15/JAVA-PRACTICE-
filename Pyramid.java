//Pyramid Pattern program in java.
public class Pyramid {
    public static void main (String [] s)
    {
        int n = 6;
        for ( int i=0 ; i < n ; i++)
        {
            for (int j = n-i ; j > 1 ; j--)
            {
            System.out.print(" ");
            }   
            for ( int j=0 ; j <= i; j++)
            {
            System.out.print("* ");
            }    
        System.out.println();
        }
    }
}
