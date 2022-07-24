//Find the Factors of a Number in Java

public class factors_of_number {
    public static void main (String[] s)
    {
        int number = 5;
        System.out.println("Factors of "+ number + " are");
        for (int i=1;i<=number;i++)
        {
            if (number % i == 0)
                System.out.println(i);
        }
    }
}
