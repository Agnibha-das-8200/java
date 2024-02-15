import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Define the correct answer
        String correctAnswer = "OpenAI";

        // Prompt the user for input
        System.out.println("Welcome to the Quiz Game!");
        System.out.print("What is the name of the organization that created me? ");
        
        // Take user input
        String userAnswer = scanner.nextLine();

        // Check if the user's answer is correct
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Congratulations! Your answer is correct.");
        } else {
            System.out.println("Oops! Your answer is incorrect. The correct answer is: " + correctAnswer);
        }

        // Close the scanner
        scanner.close();
    }
}
