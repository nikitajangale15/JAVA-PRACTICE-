// Given an integer num input the objective is to write a code to Check if a Given Number is Positive or Negative in Java Language.

import java.util.Scanner;
public class PositveNumber
{
    public static void main(String [] args) {
    int n;
    Scanner sc= new Scanner(System.in) ;
    n = sc.nextInt();
    if (n>0)
        System.out.println("The Given Number " + n + " is Positive");
    else 
        if (n<0)
            System.out.println("The Given Number "+ n + " is Negative");
    else 
        System.out.println("The Given Number is Zero");      
    }
}
