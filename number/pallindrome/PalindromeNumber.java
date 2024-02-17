import java.util.*;
public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int o = n;
        int pali = 0;
        while (n > 0) 
        {
            int a = n % 10;
            pali = (pali * 10 )+ a;
            n=n/ 10;
        }
        if (o == pali)
        {
            System.out.println(o + " is a palindrome.");
        }
        else 
        {
            System.out.println(o + " is not a palindrome.");
        }
    }
}
