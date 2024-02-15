import java.util.Scanner;

public class QuizGamegpt
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Answer the following 5 questions:");

        int score = 0;

        // Question 1
        System.out.println("1. What is the capital of Japan?");
        score += checkAnswer("Tokyo", scanner.nextLine().trim());

        // Question 2
        System.out.println("2. Which planet is known as the Red Planet?");
        score += checkAnswer("Mars", scanner.nextLine().trim());

        // Question 3
        System.out.println("3. What is the largest mammal on Earth?");
        score += checkAnswer("Blue Whale", scanner.nextLine().trim());

        // Question 4
        System.out.println("4. Who wrote 'Romeo and Juliet'?");
        score += checkAnswer("William Shakespeare", scanner.nextLine().trim());

        // Question 5
        System.out.println("5. What is the currency of Germany?");
        score += checkAnswer("Euro", scanner.nextLine().trim());

        System.out.println("Your final score is: " + score);

        scanner.close();
    }

    private static int checkAnswer(String correctAnswer, String userAnswer) {
        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct! +1 point");
            return 1;
        } else {
            System.out.println("Incorrect. The correct answer is: " + correctAnswer + " -1 point");
            return -1;
        }
    }
}
