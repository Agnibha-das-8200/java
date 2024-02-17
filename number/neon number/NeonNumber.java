import java.util.*;  
public class NeonNumber
{
    public static void main(String args[])  
    {   
        Scanner sc = new Scanner(System.in);  
        int sum = 0, n;   
        System.out.print("Enter the number to check: ");    
        n = sc.nextInt();  
        int square = n * n;    
        while(square != 0)  
        {     
            int digit = square % 10;   
            sum = sum + digit;    
            square = square / 10;  
        }   
        if(n == sum)  
        System.out.println(n + " is a Neon Number.");  
        else  
        System.out.println(n + " is not a Neon Number.");  
    }  
}  