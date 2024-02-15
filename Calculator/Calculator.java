import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");
        char choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter your choice (1/2/3/4): ");
            int operation = scanner.nextInt();
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            switch (operation) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid operation.");
                }
            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Thank you for using the Calculator!");
        scanner.close();
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
}