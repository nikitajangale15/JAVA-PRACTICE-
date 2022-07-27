//Java Program for finding the smallest element of the array.
public class smallest_element_in_array {

  public static void main(String [] s)
  {
    int array[] = {21, 44 , 73, 15, 61, 24};
    int min = array[0];
    for(int i=0; i<array.length; i++)
    {
    if(min > array[i])
      min = array[i];
    } 
    System.out.print(min); 
  }
}
