import java.util.Scanner;
public class SpyNumberCheck 
{
    public static boolean isSpyNumber(int num) 
    {
        int sum = 0, product = 1;
        while (num > 0) 
        {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        
        return sum == product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num + (isSpyNumber(num) ? " is" : " is not") + " a Spy number.");
    }
}
