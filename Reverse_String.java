//Java Program to find Reverse of the string.

public class Reverse_String {
    public static void main(String[] args) 
    {    
        String string = "computer science";      
        String rev_str = "";    
        for(int i = string.length()-1; i >= 0; i--)
        {    
            rev_str = rev_str + string.charAt(i);    
        }    
        System.out.println("Original string is : " + string);    
        System.out.println("Reverse of given string is : " + rev_str);    
    }    
}
