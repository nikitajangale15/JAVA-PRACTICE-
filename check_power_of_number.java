//Find the Power of a Number in Java.

public class check_power_of_number {
    public static void main (String[] s)
    {
        double base=2;
        int exponent=3;
        double res = 1;
        while(exponent != 0)
        {
            res*=base;
            exponent--;
        }
        System.out.println("Result = " + res);
    }
}
