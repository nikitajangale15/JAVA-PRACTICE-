//Program to Calculate Average Using Arrays in Java.
public class average_using_array {
    public static void main (String [] s)
    {
        double ar[] = { 32.2, 45, 76.21, 76.32};
        double sum = 0.0;
        for ( double num : ar)
        {
            sum += num;
        }
        double average = sum / ar.length ;
        System.out.format("the average is : %.2f ", average);
    }
}
