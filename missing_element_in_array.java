//Java program to find the missing element in array.
public class missing_element_in_array
{
  public static void main(String[] s) 
  {
 
    int arr1[] = {7,5,6,1,4,2};
    System.out.println("Missing number from array arr1: "+missing_Number(arr1));
    int arr2[] = {5,3,1,2};
    System.out.println("Missing number from array arr2: "+missing_Number(arr2));
  }
  public static int missing_Number(int[] arr)
  {
    int n = arr.length+1;
    int sum = n * (n+1) / 2;
    int totalSum = 0;
    for (int i = 0; i < arr.length; i++)  
    {
        totalSum += arr[i];
    }
    int missing_Number = sum - totalSum;
    return missing_Number;
  }
}
