//Program to find N-th Fibonacci Number in Java.

public class find_nth_fibonacci_number {
    public static void main (String[] s)
    {
        int n=3;
        System.out.println(fib(n));
    }
    static int fib (int n)
    {
        if (n<=1)
        return n ;
        return fib(n-1)+ fib(n-2);
    }
}
