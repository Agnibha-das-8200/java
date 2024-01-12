import java.util.Scanner;
public class PROJECT21 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the order details for Books:");
        int booksPrice = scanner.nextInt();// Input the order details

        System.out.println("Enter the order details for Electronics:");
        int electronicsPrice = scanner.nextInt();

        System.out.println("Enter the order details for Toys:");
        int toysPrice = scanner.nextInt();

        // Calculate total order price
        int totalOrderPrice = booksPrice + electronicsPrice + toysPrice;

        // Check if each category qualifies for free delivery or apply delivery charge
        int deliveryCharge = 0;

        if (booksPrice > 299)
        {
            System.out.println("Books - FREE Delivery");
        }
        else 
        {
            System.out.println("Books - Delivery Charge of Rs. 40");
            deliveryCharge += 40;
        }

        if (electronicsPrice > 299)
        {
            System.out.println("Electronics - FREE Delivery");
        }
        else 
        {
            System.out.println("Electronics - Delivery Charge of Rs. 40");
            deliveryCharge += 40;
        }

        if (toysPrice > 299) {
            System.out.println("Toys - FREE Delivery");
        } else {
            System.out.println("Toys - Delivery Charge of Rs. 40");
            deliveryCharge += 40;
        }
        System.out.println();
        // Display total order price and delivery charges
        System.out.println("Total Order Price: Rs." + totalOrderPrice);
        System.out.println("Total Delivery Charges: Rs." + deliveryCharge);
    }
}