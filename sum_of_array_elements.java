//Java Program for calculating the sum of all the elements of an array.
public class sum_of_array_elements 
{
    public static void main(String args[])
    {
        int arr[] = {61, 5, 12, 8, 32};
        int sum = 0;
        for(int i=0; i<arr.length; i++)
         sum = sum + arr[i];
        System.out.print(sum); 
   }
}
