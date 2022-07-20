import java.util.Scanner;

public class number3 {
    public static void main (String[]args)
   {
     int num1, num2;
     Scanner sc= new Scanner(System.in);
     num1 = sc.nextInt();
     num2 = sc.nextInt();
     if (num1 == num2)
       System.out.println ("both are equal");
     else if (num1 > num2)
         System.out.println (num1 + " is greater");

     else
         System.out.println (num2 + " is greater");

   }
}
