import java.util.*;
public class Table
 {
	public static void main(String[] args) {
        Scanner input = new         Scanner(System.in);
        int number; 
        System.out.print("Choose a number: ");
        number = input.nextInt();

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            int mutiply = number * i;
            System.out.println(number + " x " + i + " = " + mutiply);
        }
    }
}