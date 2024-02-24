/* Write a program in Java to create a quiz of 5 questions, where the user will get +1
  for a correct answer and -1 for a wrong answer. Display the final score.*/
  
import java.util.*;
public class Project18// declares class
{
   static int score=0;
   static Scanner sc=new Scanner(System.in);
   public void question1()
   {
       System.out.println("What is the name of first President?");
       String fp=sc.next();
       if (fp.equalsIgnoreCase("Rajendra prasad"))
       {
           System.out.println("Correct answer");
           score++;
       }
       if (fp.equalsIgnoreCase("R prasad") )
       {
           System.out.println("Correct answer");
           score++;
       }
       if(fp.equalsIgnoreCase("R. Prasad"))
       {
           System.out.println("Correct answer");
           score++;
       }
       else 
       {
           System.out.println("Wrong Answer \nRajendra prasad");
           score--;
       }
   }   
   public void question2()
   {
       System.out.println("How many states are there in our country \'INDIA\'?");
       int st=sc.nextInt();
       if (st==28)
       {
           System.out.println("Correct answer");
           score++;
       }
       else
       {
           System.out.println("Wrong Answer \n28");
           score--;
       }
   }
   public void question3()
   {
       System.out.println("who awarded the noble prize for\' Geetanjali\'?");
       String rt=sc.next();
       if (rt.equalsIgnoreCase("R. tagore"))
       {
           System.out.println("Correct answer");
           score++;
       }
       if(rt.equalsIgnoreCase("Rabindranath tagore"))
       {
           System.out.println("Correct answer");
           score++;
       }
       
       else
       {
           System.out.println("Wrong Answer \nRabindranath tagore");
           score--;
       }
   }
   public void question4()
   {
       System.out.println("Who is \'People's president\'?");
       String apj=sc.next();
       if(apj.equalsIgnoreCase("APJ Abdul Kalam"))
       {
           System.out.println("Correct answer");
           score++;
       }
       if (apj.equalsIgnoreCase("A.P.J. Abdul Kalam"))
       {
           System.out.println("Correct answer");
           score++;
       }
       if (apj.equalsIgnoreCase("Avul Pakir Jainulabdeen Abdul Kalam"))
       {
           System.out.println("Correct answer");
           score++;
       }
       else 
       {
           System.out.println("Wrong Answer");
           System.out.print("Avul Pakir Jainulabdeen Abdul Kalam or APJ abdul kalam");
           System.out.println(" or APJ abdul kalam");
           score--;
       }
   }
   public void question5()
   {
       System.out.println("Who invented the 1st computer?");
       String comp=sc.next();
       if (comp.equalsIgnoreCase("Charles Babbage"))
       {
           System.out.println("Correct answer");
           score++;
       }
       else
       {
           System.out.println("Wrong Answer");
           System.out.println("Charles Babbage");
           score--;
       }
   }
   public static void main (String args[])
   {
       System.out.println("Enter your name ");
       String nme=sc.nextLine();
       System.out.println("Enter your age");
       int age=sc.nextInt();
       Project18 Q=new Project18();
       Q.question1();
       System.out.println();
       Q.question5();
       System.out.println();
       Q.question3();
       System.out.println();
       Q.question4();
       System.out.println();
       Q.question2();
       System.out.println();
       try 
       {
           Thread.sleep(3000);
       }
       catch(InterruptedException f)
       {
           int a=0;
       }
       System.out.println(nme+" of age "+age+" has got "+score);
   }
}
