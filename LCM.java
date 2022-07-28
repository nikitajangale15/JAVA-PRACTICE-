//LCM of two numbers using Java

public class LCM {
    public static void main (String [] s)
    {
        int num1 = 20, num2 = 25, hcf=1;
        for ( int i=1; i<=num1 || i<=num2 ; i++)
        {
            if (num1 % i ==0 && num2 % i ==0)
                hcf=i;
        }
        int lcm = (num1 * num2)/hcf;
        System.out.println("LCM is "+lcm);
        
        
//         ALTERNATE WAY:
        
//         int num1 = 20, num2 = 25;
//         int i=Math.max(num1,num2);
//         int lcm=num1*num2;
//         while(i<=(lcm/2)){
//             if(i%num1==0 && i%num2==0){
//                 lcm=i;
//                 break;
//             }
//             i++;
//         }
        
    }
    
}
