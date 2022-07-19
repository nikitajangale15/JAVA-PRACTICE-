//Given an integer input the objective is to write a code to Find the Sum of N Natural Numbers in C++. 

import java.util.Scanner;

public class whole {
    public static void main(String[] args)
    {
        int n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0 ; i<n ; i++)
        {
            sum = sum + i;
        }
            System.out.println("Sum of N Whole number is "+ sum);
    }
}
