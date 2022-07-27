// Reverse an Array in Java
public class reverse_an_array {
    public static void main (String [] s)
    {
        int array[] = {20, 40, 60, 80, 100};
        int x = array.length;
        for ( int i=x-1; i>=0; i--)
        {
            System.out.print(array[i] +" , ");
        }
    }
}
