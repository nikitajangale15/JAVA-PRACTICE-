//Java Program for finding the largest element of the array.
public class largest_element_in_array
{
  public static void main(String [] s)
  {
     int array[] = {12, 94 , 33, 83, 19, 64};
     int max = array[0];
     for(int i=0; i<array.length; i++)
     {
       if(max < array[i])
        max = array[i];
     } 
    System.out.print(max); 
  }
}