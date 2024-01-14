/* Write a program in Java to create a quiz of 5 questions, where the user will get +1
  for a correct answer and -1 for a wrong answer. Display the final score.*/
  
import java.util.*;
public class Project18// declares class
{
    public static void main(String[] args)//declares method
    {
        Scanner sc = new Scanner(System.in);// cals the scanner class
        int score = 0;// declares the score
        System.out.println("welcome to a quiz show");
        //Question 1
        System.out.println("What is the capital of India?");
        String answer1 = sc.nextLine();// accepts the usser input
        if(answer1.equalsIgnoreCase("New Delhi") )//checks the answer
        {
            System.out.println("Correct!");
            score ++;// adds score
        }
        else{
            System.out.println("Incorrect!");
            score --;//deducts the score
        }
        System.out.println(" ");
        // Question 2
        System.out.println("Who founded DMart?");
        String answer2 = sc.nextLine();// accepts the usser input
        if(answer2.equalsIgnoreCase("Radhakrishnan Damani") || answer2.equals("R Damani")
        || answer2.equals("R. Damani") )
        {
            System.out.println("Correct!");
            score ++;// adds score
        }
        else{
            System.out.println("Incorrect!");
            score --;//deducts the score
        }
        System.out.println(" ");
        //question 3
        System.out.println("What is the eighth power of 2?");
        int answer3 = sc.nextInt();// accepts the usser input
        if(answer3 == 256){
            System.out.println("Correct!");
            score ++;// adds score
        }
        else{
            System.out.println("Incorrect!");
            score -- ;//deducts the score
        }
        System.out.println(" ");
        //question 4
        System.out.println("First President India");
        String answer4 = sc.nextLine();// accepts the usser input
        if(answer4.equalsIgnoreCase("Dr. Rajendra Prasad") ||
        answer4.equalsIgnoreCase(" Rajendra Prasad"))
        {
            System.out.println("Correct!");
            score ++;// adds score
        }
        else
        {
            System.out.println("Incorrect!");
            score --;//deducts the score
        }
        System.out.println(" ");
        System.out.println(" ");
        //question 5
        System.out.println("How many states are there in India?");
        int answer5 = sc.nextInt();// accepts the usser input
        if(answer5 == 28){
            System.out.println("Correct!");
            score ++;// adds score
        }
        else{
            System.out.println("Incorrect!");
            score --;//deducts the score
        }
        // displays the final results
        System.out.println("Thanks for participating! Your score is = "+score);
    }
}